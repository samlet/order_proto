package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("shipment_cost_estimate")
@ApiModel(value = "ShipmentCostEstimateEntity对象", description = "")
public class ShipmentCostEstimateEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shipment_cost_estimate_id", type = IdType.ASSIGN_ID)
    private String shipmentCostEstimateId;

    private String shipmentMethodTypeId;

    private String carrierPartyId;

    private String carrierRoleTypeId;

    private String productStoreShipMethId;

    private String productStoreId;

    private String partyId;

    private String roleTypeId;

    private String geoIdTo;

    private String geoIdFrom;

    private String weightBreakId;

    private String weightUomId;

    private BigDecimal weightUnitPrice;

    private String quantityBreakId;

    private String quantityUomId;

    private BigDecimal quantityUnitPrice;

    private String priceBreakId;

    private String priceUomId;

    private BigDecimal priceUnitPrice;

    private BigDecimal orderFlatPrice;

    private BigDecimal orderPricePercent;

    private BigDecimal orderItemFlatPrice;

    private BigDecimal shippingPricePercent;

    private String productFeatureGroupId;

    private BigDecimal oversizeUnit;

    private BigDecimal oversizePrice;

    private BigDecimal featurePercent;

    private BigDecimal featurePrice;


}
