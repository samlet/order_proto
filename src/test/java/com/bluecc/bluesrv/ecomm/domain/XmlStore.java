package com.bluecc.bluesrv.ecomm.domain;

import com.bluecc.bluesrv.ecomm.entity.OrderItemEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderItemService;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.common.Helper.pretty;
import static com.bluecc.bluesrv.ecomm.domain.XmlFnTest.*;

@SpringBootTest
@Slf4j
public class XmlStore {
    @Autowired
    IOrderItemService orderItemService;

    @Test
    void storeXml() throws IOException {
        Multimap<String, JsonObject> dataList= ArrayListMultimap.create();
        collectEntityData(dataList, dataSource("order_Demo1001.xml"));
        System.out.println(dataList.keySet());

        List<OrderItemEntity> orderItems=dataList.get("OrderItem").stream()
                .map(e -> gson.fromJson(e, OrderItemEntity.class))
                .collect(Collectors.toList());
        orderItems.forEach(e -> {
            log.info("{}", gson.toJson(e));
            // orderItemService.saveOrUpdate(e); // 因为有组合索引, 所以不起作用
            try {
                orderItemService.save(e);
            }catch(RuntimeException ex){
                if(ex.getCause() instanceof java.sql.SQLIntegrityConstraintViolationException) {
                    System.out.println("重复索引: "+ex.getCause().getLocalizedMessage());
                }else{
                    throw ex;
                }
            }
        });
    }
}
