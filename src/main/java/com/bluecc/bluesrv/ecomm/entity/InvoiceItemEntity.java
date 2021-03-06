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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("invoice_item")
@ApiModel(value = "InvoiceItemEntity对象", description = "")
public class InvoiceItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String invoiceId;

    private String invoiceItemSeqId;

    private String invoiceItemTypeId;

    private String overrideGlAccountId;

    private String overrideOrgPartyId;

    private String inventoryItemId;

    private String productId;

    private String productFeatureId;

    private String parentInvoiceId;

    private String parentInvoiceItemSeqId;

    private String uomId;

    private String taxableFlag;

    private BigDecimal quantity;

    private BigDecimal amount;

    private String description;

    private String taxAuthPartyId;

    private String taxAuthGeoId;

    private String taxAuthorityRateSeqId;

    private String salesOpportunityId;


}
