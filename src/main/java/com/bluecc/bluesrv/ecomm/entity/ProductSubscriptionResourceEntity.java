package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("product_subscription_resource")
@ApiModel(value = "ProductSubscriptionResourceEntity对象", description = "")
public class ProductSubscriptionResourceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productId;

    private String subscriptionResourceId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private LocalDateTime purchaseFromDate;

    private LocalDateTime purchaseThruDate;

    private BigDecimal maxLifeTime;

    private String maxLifeTimeUomId;

    private BigDecimal availableTime;

    private String availableTimeUomId;

    private BigDecimal useCountLimit;

    private BigDecimal useTime;

    private String useTimeUomId;

    private String useRoleTypeId;

    private String automaticExtend;

    private BigDecimal canclAutmExtTime;

    private String canclAutmExtTimeUomId;

    private BigDecimal gracePeriodOnExpiry;

    private String gracePeriodOnExpiryUomId;


}
