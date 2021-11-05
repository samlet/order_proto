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
@TableName("order_item_ship_grp_inv_res")
@ApiModel(value = "OrderItemShipGrpInvResEntity对象", description = "")
public class OrderItemShipGrpInvResEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String orderId;

    private String shipGroupSeqId;

    private String orderItemSeqId;

    private String inventoryItemId;

    private String reserveOrderEnumId;

    private BigDecimal quantity;

    private BigDecimal quantityNotAvailable;

    private LocalDateTime reservedDatetime;

    private LocalDateTime createdDatetime;

    private LocalDateTime promisedDatetime;

    private LocalDateTime currentPromisedDate;

    private String priority;

    private BigDecimal sequenceId;

    private LocalDateTime pickStartDate;


}
