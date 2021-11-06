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
@TableName("billing_account")
@ApiModel(value = "BillingAccountEntity对象", description = "")
public class BillingAccountEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "billing_account_id", type = IdType.ASSIGN_ID)
    private String billingAccountId;

    private BigDecimal accountLimit;

    private String accountCurrencyUomId;

    private String contactMechId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String description;

    private String externalAccountId;


}
