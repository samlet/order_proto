package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
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
@TableName("shipment_package_route_seg")
@ApiModel(value = "ShipmentPackageRouteSegEntity对象", description = "")
public class ShipmentPackageRouteSegEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String shipmentId;

    private String shipmentPackageSeqId;

    private String shipmentRouteSegmentId;

    private String trackingCode;

    private String boxNumber;

    private Blob labelImage;

    private Blob labelIntlSignImage;

    private String labelHtml;

    private String labelPrinted;

    private Blob internationalInvoice;

    private BigDecimal packageTransportCost;

    private BigDecimal packageServiceCost;

    private BigDecimal packageOtherCost;

    private BigDecimal codAmount;

    private BigDecimal insuredAmount;

    private String currencyUomId;


}
