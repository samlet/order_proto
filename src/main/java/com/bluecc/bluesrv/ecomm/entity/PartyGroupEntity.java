package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("party_group")
@ApiModel(value = "PartyGroupEntity对象", description = "")
public class PartyGroupEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "party_id", type = IdType.ASSIGN_ID)
    private String partyId;

    private String groupName;

    private String groupNameLocal;

    private String officeSiteName;

    private BigDecimal annualRevenue;

    private BigDecimal numEmployees;

    private String tickerSymbol;

    private String comments;

    private String logoImageUrl;


}
