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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_login")
@ApiModel(value = "UserLoginEntity对象", description = "")
public class UserLoginEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_login_id", type = IdType.ASSIGN_ID)
    private String userLoginId;

    private String currentPassword;

    private String passwordHint;

    private String isSystem;

    private String enabled;

    private String hasLoggedOut;

    private String requirePasswordChange;

    private String lastCurrencyUom;

    private String lastLocale;

    private String lastTimeZone;

    private LocalDateTime disabledDateTime;

    private BigDecimal successiveFailedLogins;

    private String externalAuthId;

    private String userLdapDn;

    private String disabledBy;

    private String partyId;


}
