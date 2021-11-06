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
@TableName("inventory_item")
@ApiModel(value = "InventoryItemEntity对象", description = "")
public class InventoryItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "inventory_item_id", type = IdType.ASSIGN_ID)
    private String inventoryItemId;

    private String inventoryItemTypeId;

    private String productId;

    private String partyId;

    private String ownerPartyId;

    private String statusId;

    private LocalDateTime datetimeReceived;

    private LocalDateTime datetimeManufactured;

    private LocalDateTime expireDate;

    private String facilityId;

    private String containerId;

    private String lotId;

    private String uomId;

    private String binNumber;

    private String locationSeqId;

    private String comments;

    private BigDecimal quantityOnHandTotal;

    private BigDecimal availableToPromiseTotal;

    private BigDecimal accountingQuantityTotal;

    private BigDecimal quantityOnHand;

    private BigDecimal availableToPromise;

    private String serialNumber;

    private String softIdentifier;

    private String activationNumber;

    private LocalDateTime activationValidThru;

    private BigDecimal unitCost;

    private String currencyUomId;

    private String fixedAssetId;


}
