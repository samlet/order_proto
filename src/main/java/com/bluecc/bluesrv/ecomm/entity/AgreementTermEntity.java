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
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("agreement_term")
@ApiModel(value = "AgreementTermEntity对象", description = "")
public class AgreementTermEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "agreement_term_id", type = IdType.ASSIGN_ID)
    private String agreementTermId;

    private String termTypeId;

    private String agreementId;

    private String agreementItemSeqId;

    private String invoiceItemTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal termValue;

    private BigDecimal termDays;

    private String textValue;

    private Double minQuantity;

    private Double maxQuantity;

    private String description;


}
