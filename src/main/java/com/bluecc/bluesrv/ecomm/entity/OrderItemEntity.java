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
@TableName("order_item")
@ApiModel(value = "OrderItemEntity对象", description = "")
public class OrderItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String orderId;

    private String orderItemSeqId;

    private String externalId;

    private String orderItemTypeId;

    private String orderItemGroupSeqId;

    private String isItemGroupPrimary;

    private String fromInventoryItemId;

    private String budgetId;

    private String budgetItemSeqId;

    private String productId;

    private String supplierProductId;

    private String productFeatureId;

    private String prodCatalogId;

    private String productCategoryId;

    private String isPromo;

    private String quoteId;

    private String quoteItemSeqId;

    private String shoppingListId;

    private String shoppingListItemSeqId;

    private String subscriptionId;

    private String deploymentId;

    private BigDecimal quantity;

    private BigDecimal cancelQuantity;

    private BigDecimal selectedAmount;

    private BigDecimal unitPrice;

    private BigDecimal unitListPrice;

    private BigDecimal unitAverageCost;

    private BigDecimal unitRecurringPrice;

    private String isModifiedPrice;

    private String recurringFreqUomId;

    private String itemDescription;

    private String comments;

    private String correspondingPoId;

    private String statusId;

    private String syncStatusId;

    private LocalDateTime estimatedShipDate;

    private LocalDateTime estimatedDeliveryDate;

    private LocalDateTime autoCancelDate;

    private LocalDateTime dontCancelSetDate;

    private String dontCancelSetUserLogin;

    private LocalDateTime shipBeforeDate;

    private LocalDateTime shipAfterDate;

    private LocalDateTime cancelBackOrderDate;

    private String overrideGlAccountId;

    private String salesOpportunityId;

    private String changeByUserLoginId;

    private LocalDateTime reserveAfterDate;


}
