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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product_config_item")
@ApiModel(value = "ProductConfigItemEntity对象", description = "")
public class ProductConfigItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "config_item_id", type = IdType.ASSIGN_ID)
    private String configItemId;

    private String configItemTypeId;

    private String configItemName;

    private String description;

    private String longDescription;

    private String imageUrl;


}
