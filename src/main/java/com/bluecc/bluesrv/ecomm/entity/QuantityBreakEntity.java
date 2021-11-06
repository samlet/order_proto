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
@TableName("quantity_break")
@ApiModel(value = "QuantityBreakEntity对象", description = "")
public class QuantityBreakEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "quantity_break_id", type = IdType.ASSIGN_ID)
    private String quantityBreakId;

    private String quantityBreakTypeId;

    private BigDecimal fromQuantity;

    private BigDecimal thruQuantity;


}
