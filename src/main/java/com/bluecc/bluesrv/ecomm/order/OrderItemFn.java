package com.bluecc.bluesrv.ecomm.order;

import com.bluecc.bluesrv.ecomm.entity.OrderItemEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderItemService;
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
public class OrderItemFn {
    @Autowired
    IOrderItemService orderItemService;

    @Bean
    Function<OrderElements, OrderElements> storeOrderItems(){
        return elements -> {
            List<OrderItemEntity> orderItems = elements.values.get("OrderItem").stream()
                    .map(e -> gson.fromJson(e, OrderItemEntity.class))
                    .map(e -> e.setOrderId(elements.orderId))
                    .collect(Collectors.toList());
            // orderItems.forEach(e -> orderItemService.save(e));
            orderItemService.saveBatch(orderItems);
            return elements;
        };
    }
}

