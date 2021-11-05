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
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product_price_rule")
@ApiModel(value = "ProductPriceRuleEntity对象", description = "")
public class ProductPriceRuleEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_price_rule_id", type = IdType.ASSIGN_ID)
    private String productPriceRuleId;

    private String ruleName;

    private String description;

    private String isSale;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;


}
