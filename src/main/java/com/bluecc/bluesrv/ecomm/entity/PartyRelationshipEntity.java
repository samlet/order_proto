package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
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
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("party_relationship")
@ApiModel(value = "PartyRelationshipEntity对象", description = "")
public class PartyRelationshipEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String partyIdFrom;

    private String partyIdTo;

    private String roleTypeIdFrom;

    private String roleTypeIdTo;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String statusId;

    private String relationshipName;

    private String securityGroupId;

    private String priorityTypeId;

    private String partyRelationshipTypeId;

    private String permissionsEnumId;

    private String positionTitle;

    private String comments;


}
