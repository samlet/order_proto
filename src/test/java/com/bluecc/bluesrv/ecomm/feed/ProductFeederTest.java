package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.entity.ProductEntity;
import com.bluecc.bluesrv.ecomm.service.IProductService;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static com.bluecc.bluesrv.common.Helper.pretty;
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

    Function<ProductEntity, String> storeProduct(){
        return e -> {
            productService.save(e);
            return e.getProductId();
        };
    }
    Function<String, ProductEntity> retrieveProduct(){
        return id -> productService.getById(id);
    }

    @Data
    @Builder
    static class EntityStats{
        long total;
    }

    Function<String, EntityStats> getProductStats(){
        return level -> EntityStats.builder()
                .total(productService.count())
                .build();
    }

    @Test
    void storeFn(){
        String prodId=storeProduct().apply(productFeeder.single());
        System.out.println(prodId);

        ProductEntity prod= retrieveProduct().apply(prodId);
        pretty(prod);
    }

    @Test
    void statsFn(){
        System.out.println(getProductStats().apply("verbose").total);
    }
}
