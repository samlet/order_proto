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
@TableName("product_assoc")
@ApiModel(value = "ProductAssocEntity对象", description = "")
public class ProductAssocEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productId;

    private String productIdTo;

    private String productAssocTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal sequenceNum;

    private String reason;

    private BigDecimal quantity;

    private BigDecimal scrapFactor;

    private String instruction;

    private String routingWorkEffortId;

    private String estimateCalcMethod;

    private String recurrenceInfoId;


}
