package com.bluecc.bluesrv.ecomm.domain;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.bluecc.bluesrv.ecomm.entity.OrderHeaderEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemPriceInfoEntity;
import com.bluecc.bluesrv.ecomm.order.PurchaseOrder;
import com.bluecc.bluesrv.ecomm.service.IOrderHeaderService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemPriceInfoService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemService;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.common.Helper.collectEntityData;
import static com.bluecc.bluesrv.common.Helper.pretty;
import static com.bluecc.bluesrv.ecomm.domain.XmlFnTest.*;
import static com.bluecc.bluesrv.ecomm.order.PurchaseOrder.gson;

@SpringBootTest
@Slf4j
public class XmlStore {
    @Autowired
    IOrderItemService orderItemService;

    @Autowired
    PurchaseOrder purchaseOrder;
    @Test
    void storeXml() throws IOException {
        Multimap<String, JsonObject> dataList= ArrayListMultimap.create();
        collectEntityData(dataList, dataSource("PurchaseOrder_Demo1001.xml"));
        System.out.println(dataList.keySet());

        List<OrderItemEntity> orderItems=dataList.get("OrderItem").stream()
                .map(e -> gson.fromJson(e, OrderItemEntity.class))
                .collect(Collectors.toList());
        orderItems.forEach(e -> store(e));
    }

    @Test
    void storeWithFn() throws IOException {
        // PurchaseOrder purchaseOrder=new PurchaseOrder();
        purchaseOrder.createPurchaseOrder().apply(dataSource("PurchaseOrder_Demo1001.xml"));
    }

    private void store(OrderItemEntity e) {
        log.info("{}", gson.toJson(e));
        // orderItemService.saveOrUpdate(e); // 因为有组合索引, 所以不起作用
        try {
            orderItemService.save(e);
        }catch(RuntimeException ex){
            if(ex.getCause() instanceof java.sql.SQLIntegrityConstraintViolationException) {
                log.error("重复索引: "+ex.getCause().getLocalizedMessage());
            }else{
                throw ex;
            }
        }
    }
}
