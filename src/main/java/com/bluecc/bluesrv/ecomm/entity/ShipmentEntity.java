package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("shipment")
@ApiModel(value = "ShipmentEntity对象", description = "")
public class ShipmentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shipment_id", type = IdType.ASSIGN_ID)
    private String shipmentId;

    private String shipmentTypeId;

    private String statusId;

    private String primaryOrderId;

    private String primaryReturnId;

    private String primaryShipGroupSeqId;

    private String picklistBinId;

    private LocalDateTime estimatedReadyDate;

    private LocalDateTime estimatedShipDate;

    private String estimatedShipWorkEffId;

    private LocalDateTime estimatedArrivalDate;

    private String estimatedArrivalWorkEffId;

    private LocalDateTime latestCancelDate;

    private BigDecimal estimatedShipCost;

    private String currencyUomId;

    private String handlingInstructions;

    private String originFacilityId;

    private String destinationFacilityId;

    private String originContactMechId;

    private String originTelecomNumberId;

    private String destinationContactMechId;

    private String destinationTelecomNumberId;

    private String partyIdTo;

    private String partyIdFrom;

    private BigDecimal additionalShippingCharge;

    private String addtlShippingChargeDesc;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
