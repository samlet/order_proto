package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
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
@TableName("invoice")
@ApiModel(value = "InvoiceEntity对象", description = "")
public class InvoiceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "invoice_id", type = IdType.ASSIGN_ID)
    private String invoiceId;

    private String invoiceTypeId;

    private String partyIdFrom;

    private String partyId;

    private String roleTypeId;

    private String statusId;

    private String billingAccountId;

    private String contactMechId;

    private LocalDateTime invoiceDate;

    private LocalDateTime dueDate;

    private LocalDateTime paidDate;

    private String invoiceMessage;

    private String referenceNumber;

    private String description;

    private String currencyUomId;

    private String recurrenceInfoId;


}
