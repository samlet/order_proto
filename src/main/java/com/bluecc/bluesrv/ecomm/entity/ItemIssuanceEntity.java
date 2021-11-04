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
 * @since 2021-11-04
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("item_issuance")
@ApiModel(value = "ItemIssuanceEntity对象", description = "")
public class ItemIssuanceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "item_issuance_id", type = IdType.ASSIGN_ID)
    private String itemIssuanceId;

    private String orderId;

    private String orderItemSeqId;

    private String shipGroupSeqId;

    private String inventoryItemId;

    private String shipmentId;

    private String shipmentItemSeqId;

    private String fixedAssetId;

    private String maintHistSeqId;

    private LocalDateTime issuedDateTime;

    private String issuedByUserLoginId;

    private BigDecimal quantity;

    private BigDecimal cancelQuantity;


}
