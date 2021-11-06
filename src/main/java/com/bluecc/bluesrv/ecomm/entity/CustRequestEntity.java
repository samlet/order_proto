package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("cust_request")
@ApiModel(value = "CustRequestEntity对象", description = "")
public class CustRequestEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cust_request_id", type = IdType.ASSIGN_ID)
    private String custRequestId;

    private String custRequestTypeId;

    private String custRequestCategoryId;

    private String statusId;

    private String fromPartyId;

    private BigDecimal priority;

    private LocalDateTime custRequestDate;

    private LocalDateTime responseRequiredDate;

    private String custRequestName;

    private String description;

    private String maximumAmountUomId;

    private String productStoreId;

    private String salesChannelEnumId;

    private String fulfillContactMechId;

    private String currencyUomId;

    private LocalDateTime openDateTime;

    private LocalDateTime closedDateTime;

    private String internalComment;

    private String reason;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
