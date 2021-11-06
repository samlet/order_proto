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
@TableName("web_site")
@ApiModel(value = "WebSiteEntity对象", description = "")
public class WebSiteEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "web_site_id", type = IdType.ASSIGN_ID)
    private String webSiteId;

    private String siteName;

    private String httpHost;

    private String httpPort;

    private String httpsHost;

    private String httpsPort;

    private String enableHttps;

    private String webappPath;

    private String standardContentPrefix;

    private String secureContentPrefix;

    private String cookieDomain;

    private String visualThemeSetId;

    private String productStoreId;

    private String allowProductStoreChange;

    private String hostedPathAlias;

    private String isDefault;

    private String displayMaintenancePage;


}
