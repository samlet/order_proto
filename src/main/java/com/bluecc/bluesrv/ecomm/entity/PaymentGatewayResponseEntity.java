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
@TableName("payment_gateway_response")
@ApiModel(value = "PaymentGatewayResponseEntity对象", description = "")
public class PaymentGatewayResponseEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "payment_gateway_response_id", type = IdType.ASSIGN_ID)
    private String paymentGatewayResponseId;

    private String paymentServiceTypeEnumId;

    private String orderPaymentPreferenceId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String transCodeEnumId;

    private BigDecimal amount;

    private String currencyUomId;

    private String referenceNum;

    private String altReference;

    private String subReference;

    private String gatewayCode;

    private String gatewayFlag;

    private String gatewayAvsResult;

    private String gatewayCvResult;

    private String gatewayScoreResult;

    private String gatewayMessage;

    private LocalDateTime transactionDate;

    private String resultDeclined;

    private String resultNsf;

    private String resultBadExpire;

    private String resultBadCardNumber;


}
