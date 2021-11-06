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
@TableName("inventory_item_detail")
@ApiModel(value = "InventoryItemDetailEntity对象", description = "")
public class InventoryItemDetailEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String inventoryItemId;

    private String inventoryItemDetailSeqId;

    private LocalDateTime effectiveDate;

    private BigDecimal quantityOnHandDiff;

    private BigDecimal availableToPromiseDiff;

    private BigDecimal accountingQuantityDiff;

    private BigDecimal unitCost;

    private String orderId;

    private String orderItemSeqId;

    private String shipGroupSeqId;

    private String shipmentId;

    private String shipmentItemSeqId;

    private String returnId;

    private String returnItemSeqId;

    private String workEffortId;

    private String fixedAssetId;

    private String maintHistSeqId;

    private String itemIssuanceId;

    private String receiptId;

    private String physicalInventoryId;

    private String reasonEnumId;

    private String description;


}
