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
@TableName("telecom_number")
@ApiModel(value = "TelecomNumberEntity对象", description = "")
public class TelecomNumberEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "contact_mech_id", type = IdType.ASSIGN_ID)
    private String contactMechId;

    private String countryCode;

    private String areaCode;

    private String contactNumber;

    private String askForName;


}
