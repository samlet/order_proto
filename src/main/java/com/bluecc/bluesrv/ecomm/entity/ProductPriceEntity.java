package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author samlet
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product_price")
@ApiModel(value = "ProductPriceEntity对象", description = "")
public class ProductPriceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productId;

    private String productPriceTypeId;

    private String productPricePurposeId;

    private String currencyUomId;

    private String productStoreGroupId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal price;

    private String termUomId;

    private String customPriceCalcService;

    private BigDecimal priceWithoutTax;

    private BigDecimal priceWithTax;

    private BigDecimal taxAmount;

    private BigDecimal taxPercentage;

    private String taxAuthPartyId;

    private String taxAuthGeoId;

    private String taxInPrice;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
