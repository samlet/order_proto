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
@TableName("prod_catalog")
@ApiModel(value = "ProdCatalogEntity对象", description = "")
public class ProdCatalogEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "prod_catalog_id", type = IdType.ASSIGN_ID)
    private String prodCatalogId;

    private String catalogName;

    private String useQuickAdd;

    private String styleSheet;

    private String headerLogo;

    private String contentPathPrefix;

    private String templatePathPrefix;

    private String viewAllowPermReqd;

    private String purchaseAllowPermReqd;


}
