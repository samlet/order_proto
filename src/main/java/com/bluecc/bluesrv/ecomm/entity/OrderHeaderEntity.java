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
@TableName("order_header")
@ApiModel(value = "OrderHeaderEntity对象", description = "")
public class OrderHeaderEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.ASSIGN_ID)
    private String orderId;

    private String orderTypeId;

    private String orderName;

    private String externalId;

    private String salesChannelEnumId;

    private LocalDateTime orderDate;

    private String priority;

    private LocalDateTime entryDate;

    private LocalDateTime pickSheetPrintedDate;

    private String visitId;

    private String statusId;

    private String createdBy;

    private String firstAttemptOrderId;

    private String currencyUom;

    private String syncStatusId;

    private String billingAccountId;

    private String originFacilityId;

    private String webSiteId;

    private String productStoreId;

    private String agreementId;

    private String terminalId;

    private String transactionId;

    private String autoOrderShoppingListId;

    private String needsInventoryIssuance;

    private String isRushOrder;

    private String internalCode;

    private BigDecimal remainingSubTotal;

    private BigDecimal grandTotal;

    private String isViewed;

    private String invoicePerShipment;


}
