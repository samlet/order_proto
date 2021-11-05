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
@TableName("payment_application")
@ApiModel(value = "PaymentApplicationEntity对象", description = "")
public class PaymentApplicationEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "payment_application_id", type = IdType.ASSIGN_ID)
    private String paymentApplicationId;

    private String paymentId;

    private String invoiceId;

    private String invoiceItemSeqId;

    private String billingAccountId;

    private String overrideGlAccountId;

    private String toPaymentId;

    private String taxAuthGeoId;

    private BigDecimal amountApplied;


}
