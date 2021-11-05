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
@TableName("product_category")
@ApiModel(value = "ProductCategoryEntity对象", description = "")
public class ProductCategoryEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_category_id", type = IdType.ASSIGN_ID)
    private String productCategoryId;

    private String productCategoryTypeId;

    private String primaryParentCategoryId;

    private String categoryName;

    private String description;

    private String longDescription;

    private String categoryImageUrl;

    private String linkOneImageUrl;

    private String linkTwoImageUrl;

    private String detailScreen;

    private String showInSelect;


}
