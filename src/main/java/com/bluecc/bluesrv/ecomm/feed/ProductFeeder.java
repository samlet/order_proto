package com.bluecc.bluesrv.ecomm.feed;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.bluecc.bluesrv.ecomm.entity.ProductEntity;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Component
public class ProductFeeder extends FeederBase{
    ProductEntity fixture(){
        return new ProductEntity().setProductId("GZ-1006")
                .setProductTypeId("FINISHED_GOOD")
                .setPrimaryProductCategoryId("102")
                .setProductName("Open Gizmo")
                .setInternalName("Open Gizmo")
                .setDescription("Gizmo based on open standards")
                .setLongDescription("Highest quality gizmo around.")
                .setTaxable("Y")
                .setChargeShipping("Y")
                .setAutoCreateKeywords("Y")
                .setIsVariant("Y")
                .setIsVariant("N")
                .setCreatedDate(LocalDateTime.parse("2001-05-13 12:00:00.0"))
                .setCreatedByUserLogin("admin")
                .setLastModifiedDate(LocalDateTime.parse("2001-05-13 12:00:00.0"))
                .setLastModifiedByUserLogin("admin");
    }

    List<String> productTypes = Arrays.asList("FINISHED_GOOD",
            "GOOD", "RAW_MATERIAL", "DIGITAL_GOOD", "SERVICE");

    ProductEntity single(){
        String prodName=faker.commerce().productName();
        String prodDesc="Desc: "+prodName;
        LocalDateTime dt=LocalDateTime.parse("2001-05-13T12:00:00.0")
                .plusHours(rand.nextInt(12));
        return new ProductEntity().setProductId(randId())
                .setProductTypeId(choose(productTypes))
                .setPrimaryProductCategoryId(randRangeId(102))
                .setProductName(prodName)
                .setInternalName(prodName)
                .setDescription(prodDesc)
                .setLongDescription(prodDesc)
                .setTaxable(choose(indicator))
                .setChargeShipping(choose(indicator))
                .setAutoCreateKeywords(choose(indicator))
                .setIsVariant(choose(indicator))
                .setIsVariant(choose(indicator))
                .setCreatedDate(dt)
                .setCreatedByUserLogin("admin")
                .setLastModifiedDate(dt)
                .setLastModifiedByUserLogin("admin");
    }
}
