package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
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
@TableName("shipment_route_segment")
@ApiModel(value = "ShipmentRouteSegmentEntity对象", description = "")
public class ShipmentRouteSegmentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String shipmentId;

    private String shipmentRouteSegmentId;

    private String deliveryId;

    private String originFacilityId;

    private String destFacilityId;

    private String originContactMechId;

    private String originTelecomNumberId;

    private String destContactMechId;

    private String destTelecomNumberId;

    private String carrierPartyId;

    private String shipmentMethodTypeId;

    private String carrierServiceStatusId;

    private String carrierDeliveryZone;

    private String carrierRestrictionCodes;

    private String carrierRestrictionDesc;

    private BigDecimal billingWeight;

    private String billingWeightUomId;

    private BigDecimal actualTransportCost;

    private BigDecimal actualServiceCost;

    private BigDecimal actualOtherCost;

    private BigDecimal actualCost;

    private String currencyUomId;

    private LocalDateTime actualStartDate;

    private LocalDateTime actualArrivalDate;

    private LocalDateTime estimatedStartDate;

    private LocalDateTime estimatedArrivalDate;

    private String trackingIdNumber;

    private String trackingDigest;

    private String updatedByUserLoginId;

    private LocalDateTime lastUpdatedDate;

    private String homeDeliveryType;

    private LocalDateTime homeDeliveryDate;

    private String thirdPartyAccountNumber;

    private String thirdPartyPostalCode;

    private String thirdPartyCountryGeoCode;

    private Blob upsHighValueReport;


}
