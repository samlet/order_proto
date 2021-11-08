package com.bluecc.bluesrv.ecomm.order;


import com.bluecc.bluesrv.ecomm.entity.OrderHeaderEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderHeaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.ecomm.order.PurchaseOrder.gson;

@Configuration
@Slf4j
public class OrderHeaderFn {
    @Autowired
    IOrderHeaderService orderHeaderService;
    @Bean
    Function<OrderElements, OrderElements> storeOrderHeader() {
        return elements -> storeOrderHeader(elements);
    }

    private OrderElements storeOrderHeader(OrderElements rs) {
        List<OrderHeaderEntity> orderHeader= rs.values.get("OrderHeader").stream()
                .map(e -> gson.fromJson(e, OrderHeaderEntity.class))
                .map(e -> e.setOrderId(rs.orderId))
                .collect(Collectors.toList());
        // orderHeader.forEach(e -> orderHeaderService.save(e));
        orderHeaderService.saveBatch(orderHeader);
        return rs;
    }

    @Bean
    Function<String, OrderHeaderEntity> retrieveOrderHeader(){
        return id -> orderHeaderService.getById(id);
    }
}

