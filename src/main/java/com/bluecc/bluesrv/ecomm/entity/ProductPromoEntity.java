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
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product_promo")
@ApiModel(value = "ProductPromoEntity对象", description = "")
public class ProductPromoEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_promo_id", type = IdType.ASSIGN_ID)
    private String productPromoId;

    private String promoName;

    private String promoText;

    private String userEntered;

    private String showToCustomer;

    private String requireCode;

    private BigDecimal useLimitPerOrder;

    private BigDecimal useLimitPerCustomer;

    private BigDecimal useLimitPerPromotion;

    private BigDecimal billbackFactor;

    private String overrideOrgPartyId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
