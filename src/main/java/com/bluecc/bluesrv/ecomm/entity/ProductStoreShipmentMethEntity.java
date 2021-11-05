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
@TableName("product_store_shipment_meth")
@ApiModel(value = "ProductStoreShipmentMethEntity对象", description = "")
public class ProductStoreShipmentMethEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_store_ship_meth_id", type = IdType.ASSIGN_ID)
    private String productStoreShipMethId;

    private String productStoreId;

    private String shipmentMethodTypeId;

    private String partyId;

    private String roleTypeId;

    private String companyPartyId;

    private BigDecimal minWeight;

    private BigDecimal maxWeight;

    private BigDecimal minSize;

    private BigDecimal maxSize;

    private BigDecimal minTotal;

    private BigDecimal maxTotal;

    private String allowUspsAddr;

    private String requireUspsAddr;

    private String allowCompanyAddr;

    private String requireCompanyAddr;

    private String includeNoChargeItems;

    private String includeFeatureGroup;

    private String excludeFeatureGroup;

    private String includeGeoId;

    private String excludeGeoId;

    private String serviceName;

    private String configProps;

    private String shipmentCustomMethodId;

    private String shipmentGatewayConfigId;

    private BigDecimal sequenceNumber;

    private BigDecimal allowancePercent;

    private BigDecimal minimumPrice;


}
