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
 * @since 2021-11-04
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("contact_mech")
@ApiModel(value = "ContactMechEntity对象", description = "")
public class ContactMechEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "contact_mech_id", type = IdType.ASSIGN_ID)
    private String contactMechId;

    private String contactMechTypeId;

    private String infoString;


}
