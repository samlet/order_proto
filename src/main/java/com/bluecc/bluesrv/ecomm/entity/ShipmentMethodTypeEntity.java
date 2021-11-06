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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("shipment_method_type")
@ApiModel(value = "ShipmentMethodTypeEntity对象", description = "")
public class ShipmentMethodTypeEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shipment_method_type_id", type = IdType.ASSIGN_ID)
    private String shipmentMethodTypeId;

    private String description;

    private BigDecimal sequenceNum;


}
