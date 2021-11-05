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
@TableName("shipment_package")
@ApiModel(value = "ShipmentPackageEntity对象", description = "")
public class ShipmentPackageEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String shipmentId;

    private String shipmentPackageSeqId;

    private String shipmentBoxTypeId;

    private LocalDateTime dateCreated;

    private BigDecimal boxLength;

    private BigDecimal boxHeight;

    private BigDecimal boxWidth;

    private String dimensionUomId;

    private BigDecimal weight;

    private String weightUomId;

    private BigDecimal insuredValue;


}
