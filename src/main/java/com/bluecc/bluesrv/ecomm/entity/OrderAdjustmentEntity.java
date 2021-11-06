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
@TableName("order_adjustment")
@ApiModel(value = "OrderAdjustmentEntity对象", description = "")
public class OrderAdjustmentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_adjustment_id", type = IdType.ASSIGN_ID)
    private String orderAdjustmentId;

    private String orderAdjustmentTypeId;

    private String orderId;

    private String orderItemSeqId;

    private String shipGroupSeqId;

    private String comments;

    private String description;

    private BigDecimal amount;

    private BigDecimal recurringAmount;

    private BigDecimal amountAlreadyIncluded;

    private String productPromoId;

    private String productPromoRuleId;

    private String productPromoActionSeqId;

    private String productFeatureId;

    private String correspondingProductId;

    private String taxAuthorityRateSeqId;

    private String sourceReferenceId;

    private BigDecimal sourcePercentage;

    private String customerReferenceId;

    private String primaryGeoId;

    private String secondaryGeoId;

    private BigDecimal exemptAmount;

    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private String overrideGlAccountId;

    private String includeInTax;

    private String includeInShipping;

    private String isManual;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private String originalAdjustmentId;

    private BigDecimal amountPerQuantity;

    private Double percentage;


}
