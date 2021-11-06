package com.bluecc.bluesrv.ecomm.domain;

import com.bluecc.bluesrv.common.Helper;
import com.bluecc.bluesrv.ecomm.entity.OrderHeaderEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemEntity;
import com.bluecc.bluesrv.ecomm.entity.OrderItemPriceInfoEntity;
import com.google.common.base.Charsets;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.common.Helper.*;
import static com.bluecc.bluesrv.ecomm.order.PurchaseOrder.gson;
import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;

public class XmlFnTest {
    static String dataSource(String src) throws IOException {
        return Resources.toString(Resources
                        .getResource("seed/" + src),
                Charsets.UTF_8);
    }

    @Test
    void processOrder() throws IOException {
        Multimap<String, JsonObject> dataList= ArrayListMultimap.create();
        collectEntityData(dataList, dataSource("PurchaseOrder_Demo1001.xml"));
        System.out.println(dataList.keySet());

        List<OrderItemEntity> orderItems=dataList.get("OrderItem").stream()
                .map(e -> gson.fromJson(e, OrderItemEntity.class))
                .collect(Collectors.toList());
        orderItems.forEach(e -> pretty(e));

        List<OrderHeaderEntity> orderHeader=dataList.get("OrderHeader").stream()
                .map(e -> gson.fromJson(e, OrderHeaderEntity.class))
                .collect(Collectors.toList());
        orderHeader.forEach(e -> pretty(e));

        List<OrderItemPriceInfoEntity> orderItemPriceInfoEntities=dataList.get("OrderItemPriceInfo").stream()
                .map(e -> gson.fromJson(e, OrderItemPriceInfoEntity.class))
                .collect(Collectors.toList());
        orderItemPriceInfoEntities.forEach(e -> pretty(e));
    }
}
