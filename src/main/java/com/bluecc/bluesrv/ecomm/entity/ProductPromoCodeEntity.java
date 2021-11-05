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
@TableName("product_promo_code")
@ApiModel(value = "ProductPromoCodeEntity对象", description = "")
public class ProductPromoCodeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_promo_code_id", type = IdType.ASSIGN_ID)
    private String productPromoCodeId;

    private String productPromoId;

    private String userEntered;

    private String requireEmailOrParty;

    private BigDecimal useLimitPerCode;

    private BigDecimal useLimitPerCustomer;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
