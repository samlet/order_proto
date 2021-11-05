package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
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
@TableName("product_feature_category")
@ApiModel(value = "ProductFeatureCategoryEntity对象", description = "")
public class ProductFeatureCategoryEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_feature_category_id", type = IdType.ASSIGN_ID)
    private String productFeatureCategoryId;

    private String parentCategoryId;

    private String description;


}
