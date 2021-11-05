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
@TableName("shipment_receipt")
@ApiModel(value = "ShipmentReceiptEntity对象", description = "")
public class ShipmentReceiptEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "receipt_id", type = IdType.ASSIGN_ID)
    private String receiptId;

    private String inventoryItemId;

    private String productId;

    private String shipmentId;

    private String shipmentItemSeqId;

    private String shipmentPackageSeqId;

    private String orderId;

    private String orderItemSeqId;

    private String returnId;

    private String returnItemSeqId;

    private String rejectionId;

    private String receivedByUserLoginId;

    private LocalDateTime datetimeReceived;

    private String itemDescription;

    private BigDecimal quantityAccepted;

    private BigDecimal quantityRejected;


}
