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
@TableName("shipment_box_type")
@ApiModel(value = "ShipmentBoxTypeEntity对象", description = "")
public class ShipmentBoxTypeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shipment_box_type_id", type = IdType.ASSIGN_ID)
    private String shipmentBoxTypeId;

    private String description;

    private String dimensionUomId;

    private BigDecimal boxLength;

    private BigDecimal boxWidth;

    private BigDecimal boxHeight;

    private String weightUomId;

    private BigDecimal boxWeight;


}
