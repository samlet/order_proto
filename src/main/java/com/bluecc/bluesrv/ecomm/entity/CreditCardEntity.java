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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("credit_card")
@ApiModel(value = "CreditCardEntity对象", description = "")
public class CreditCardEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "payment_method_id", type = IdType.ASSIGN_ID)
    private String paymentMethodId;

    private String cardType;

    private String cardNumber;

    private String validFromDate;

    private String expireDate;

    private String issueNumber;

    private String companyNameOnCard;

    private String titleOnCard;

    private String firstNameOnCard;

    private String middleNameOnCard;

    private String lastNameOnCard;

    private String suffixOnCard;

    private String contactMechId;

    private BigDecimal consecutiveFailedAuths;

    private LocalDateTime lastFailedAuthDate;

    private BigDecimal consecutiveFailedNsf;

    private LocalDateTime lastFailedNsfDate;


}
