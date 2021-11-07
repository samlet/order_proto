package com.bluecc.bluesrv.ecomm.order;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.bluecc.bluesrv.common.Helper;
import com.bluecc.bluesrv.ecomm.entity.OrderItemPriceInfoEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderRoleEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderItemPriceInfoService;
import com.bluecc.bluesrv.ecomm.service.IOrderRoleService;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.common.Helper.*;

@Configuration
@Slf4j
@Transactional
public class PurchaseOrder {
    // @Autowired
    // IOrderItemService orderItemService;
    @Autowired
    OrderItemFn orderItemFn;
    @Autowired
    OrderHeaderFn orderHeaderFn;
    @Autowired
    OrderRoleFn orderRoleFn;

    @Autowired
    IOrderItemPriceInfoService orderItemPriceInfoService;

    public static final Gson gson = new GsonBuilder()
            // .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .registerTypeAdapter(LocalDateTime.class, new Helper.LocalDateTimeAdapterWithFormat().nullSafe())
            .setPrettyPrinting()
            .create();


    @Data
    @Accessors(chain = true)
    public static class Response{
        String result;
        String id;
    }
    DefaultIdentifierGenerator identifierGenerator = new DefaultIdentifierGenerator();

    @Bean
    public Function<String, Response> createPurchaseOrder(){
        return source -> {
            Multimap<String, JsonObject> dataList= ArrayListMultimap.create();
            collectEntityData(dataList, source);
            log.info("data entries: {}", dataList.keySet());
            // resign the order id
            String orderId=identifierGenerator.nextId(null).toString();

            // List<OrderItemEntity> orderItems=dataList.get("OrderItem").stream()
            //         .map(e -> gson.fromJson(e, OrderItemEntity.class))
            //         .map(e -> e.setOrderId(orderId))
            //         .collect(Collectors.toList());
            // orderItemService.saveBatch(orderItems);

            OrderElements ds=new OrderElements(orderId, dataList.asMap());
            orderHeaderFn.storeOrderHeader()
                    .andThen(orderItemFn.storeOrderItems())
                    .andThen(orderRoleFn.storeOrderRoles())
                    .apply(ds);

            // storeOrderHeader(dataList, orderId);
            storeOrderItemPrice(dataList, orderId);
            // storeOrderRoles(dataList, orderId);

            return new Response().setResult("ok").setId(orderId);
        };
    }

    private void storeOrderItemPrice(Multimap<String, JsonObject> dataList, String orderId) {
        List<OrderItemPriceInfoEntity> orderItemPriceInfoEntities= dataList.get("OrderItemPriceInfo").stream()
                .map(e -> gson.fromJson(e, OrderItemPriceInfoEntity.class))
                .map(e -> e.setOrderId(orderId).setOrderItemPriceInfoId(null))
                .collect(Collectors.toList());
        orderItemPriceInfoEntities.forEach(e -> orderItemPriceInfoService.save(e));
    }

}

