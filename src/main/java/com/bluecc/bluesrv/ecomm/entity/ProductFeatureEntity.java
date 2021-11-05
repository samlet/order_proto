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
@TableName("product_feature")
@ApiModel(value = "ProductFeatureEntity对象", description = "")
public class ProductFeatureEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_feature_id", type = IdType.ASSIGN_ID)
    private String productFeatureId;

    private String productFeatureTypeId;

    private String productFeatureCategoryId;

    private String description;

    private String uomId;

    private BigDecimal numberSpecified;

    private BigDecimal defaultAmount;

    private BigDecimal defaultSequenceNum;

    private String abbrev;

    private String idCode;


}
