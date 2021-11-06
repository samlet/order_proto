package com.bluecc.bluesrv.ecomm.order;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.bluecc.bluesrv.common.Helper;
import com.bluecc.bluesrv.ecomm.entity.OrderHeaderEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemPriceInfoEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderHeaderService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemPriceInfoService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemService;
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
    @Autowired
    IOrderItemService orderItemService;
    @Autowired
    IOrderHeaderService orderHeaderService;
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

            List<OrderItemEntity> orderItems=dataList.get("OrderItem").stream()
                    .map(e -> gson.fromJson(e, OrderItemEntity.class))
                    .map(e -> e.setOrderId(orderId))
                    .collect(Collectors.toList());
            orderItems.forEach(e -> orderItemService.save(e));

            List<OrderHeaderEntity> orderHeader=dataList.get("OrderHeader").stream()
                    .map(e -> gson.fromJson(e, OrderHeaderEntity.class))
                    .map(e -> e.setOrderId(orderId))
                    .collect(Collectors.toList());
            orderHeader.forEach(e -> orderHeaderService.save(e));

            List<OrderItemPriceInfoEntity> orderItemPriceInfoEntities=dataList.get("OrderItemPriceInfo").stream()
                    .map(e -> gson.fromJson(e, OrderItemPriceInfoEntity.class))
                    .map(e -> e.setOrderId(orderId).setOrderItemPriceInfoId(null))
                    .collect(Collectors.toList());
            orderItemPriceInfoEntities.forEach(e -> orderItemPriceInfoService.save(e));

            return new Response().setResult("ok").setId(orderId);
        };
    }
}

