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
@TableName("payment")
@ApiModel(value = "PaymentEntity对象", description = "")
public class PaymentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "payment_id", type = IdType.ASSIGN_ID)
    private String paymentId;

    private String paymentTypeId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String paymentGatewayResponseId;

    private String paymentPreferenceId;

    private String partyIdFrom;

    private String partyIdTo;

    private String roleTypeIdTo;

    private String statusId;

    private LocalDateTime effectiveDate;

    private String paymentRefNum;

    private BigDecimal amount;

    private String currencyUomId;

    private String comments;

    private String finAccountTransId;

    private String overrideGlAccountId;

    private BigDecimal actualCurrencyAmount;

    private String actualCurrencyUomId;


}
