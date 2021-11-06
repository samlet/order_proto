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
@TableName("order_item_ship_group")
@ApiModel(value = "OrderItemShipGroupEntity对象", description = "")
public class OrderItemShipGroupEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String orderId;

    private String shipGroupSeqId;

    private String shipmentMethodTypeId;

    private String supplierPartyId;

    private String supplierAgreementId;

    private String vendorPartyId;

    private String carrierPartyId;

    private String carrierRoleTypeId;

    private String facilityId;

    private String contactMechId;

    private String telecomContactMechId;

    private String trackingNumber;

    private String shippingInstructions;

    private String maySplit;

    private String giftMessage;

    private String isGift;

    private LocalDateTime shipAfterDate;

    private LocalDateTime shipByDate;

    private LocalDateTime estimatedShipDate;

    private LocalDateTime estimatedDeliveryDate;


}
