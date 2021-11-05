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
@TableName("product_promo_category")
@ApiModel(value = "ProductPromoCategoryEntity对象", description = "")
public class ProductPromoCategoryEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productPromoId;

    private String productPromoRuleId;

    private String productPromoActionSeqId;

    private String productPromoCondSeqId;

    private String productCategoryId;

    private String andGroupId;

    private String productPromoApplEnumId;

    private String includeSubCategories;


}
