package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("product_promo_action")
@ApiModel(value = "ProductPromoActionEntity对象", description = "")
public class ProductPromoActionEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productPromoId;

    private String productPromoRuleId;

    private String productPromoActionSeqId;

    private String productPromoActionEnumId;

    private String customMethodId;

    private String orderAdjustmentTypeId;

    private String serviceName;

    private BigDecimal quantity;

    private BigDecimal amount;

    private String productId;

    private String partyId;

    private String useCartQuantity;


}
