package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.service.IOrderHeaderService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemPriceInfoService;
import com.bluecc.bluesrv.ecomm.service.IOrderItemService;
import com.bluecc.bluesrv.ecomm.service.IOrderRoleService;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderFeederTest {
    IOrderHeaderService orderHeaderService;
    IOrderItemService orderItemService;
    IOrderItemPriceInfoService orderItemPriceInfo;
    IOrderRoleService orderRoleService;
}
