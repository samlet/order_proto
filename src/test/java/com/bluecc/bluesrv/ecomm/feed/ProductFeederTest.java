package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.entity.ProductEntity;
import com.bluecc.bluesrv.ecomm.service.IProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductFeederTest {
    @Autowired
    ProductFeeder productFeeder;
    @Autowired
    IProductService productService;

    @Test
    void single() {
        for (int i = 0; i < 5; i++) {
            ProductEntity entity = productFeeder.single();
            System.out.println(GSON.toJson(entity));
        }
    }

    @Test
    void save(){
        ProductEntity entity = productFeeder.single();
        productService.save(entity);
        System.out.println(GSON.toJson(entity));
    }
}
