package com.bluecc.bluesrv.ecomm.order;

import com.bluecc.bluesrv.ecomm.entity.OrderRoleEntity;
import com.bluecc.bluesrv.ecomm.service.IOrderRoleService;
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
public class OrderRoleFn {
    @Autowired
    IOrderRoleService orderRoleService;

    @Bean
    Function<OrderElements, OrderElements> storeOrderRoles() {
        return elements -> storeOrderRoles(elements);
    }

    private OrderElements storeOrderRoles(OrderElements ds) {
        List<OrderRoleEntity> orderRoles= ds.values.get("OrderRole").stream()
                .map(e -> gson.fromJson(e, OrderRoleEntity.class))
                .map(e -> e.setOrderId(ds.orderId))
                .collect(Collectors.toList());
        orderRoles.forEach(e -> orderRoleService.save(e));
        return ds;
    }
}
