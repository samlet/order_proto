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
@TableName("cust_request_item")
@ApiModel(value = "CustRequestItemEntity对象", description = "")
public class CustRequestItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String custRequestId;

    private String custRequestItemSeqId;

    private String custRequestResolutionId;

    private String statusId;

    private BigDecimal priority;

    private BigDecimal sequenceNum;

    private LocalDateTime requiredByDate;

    private String productId;

    private BigDecimal quantity;

    private BigDecimal selectedAmount;

    private BigDecimal maximumAmount;

    private LocalDateTime reservStart;

    private BigDecimal reservLength;

    private BigDecimal reservPersons;

    private String configId;

    private String description;

    private String story;


}
