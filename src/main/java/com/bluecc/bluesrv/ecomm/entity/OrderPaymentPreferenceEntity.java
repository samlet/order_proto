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
@TableName("order_payment_preference")
@ApiModel(value = "OrderPaymentPreferenceEntity对象", description = "")
public class OrderPaymentPreferenceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_payment_preference_id", type = IdType.ASSIGN_ID)
    private String orderPaymentPreferenceId;

    private String orderId;

    private String orderItemSeqId;

    private String shipGroupSeqId;

    private String productPricePurposeId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String finAccountId;

    private String securityCode;

    private String track2;

    private String presentFlag;

    private String swipedFlag;

    private String overflowFlag;

    private BigDecimal maxAmount;

    private BigDecimal processAttempt;

    private String billingPostalCode;

    private String manualAuthCode;

    private String manualRefNum;

    private String statusId;

    private String needsNsfRetry;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
