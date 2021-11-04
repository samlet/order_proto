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
 * @since 2021-11-04
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("party_contact_mech")
@ApiModel(value = "PartyContactMechEntity对象", description = "")
public class PartyContactMechEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String partyId;

    private String contactMechId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String roleTypeId;

    private String allowSolicitation;

    private String extension;

    private String verified;

    private String comments;

    private BigDecimal yearsWithContactMech;

    private BigDecimal monthsWithContactMech;


}
