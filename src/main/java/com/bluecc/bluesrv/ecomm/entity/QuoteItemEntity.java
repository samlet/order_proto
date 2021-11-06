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
@TableName("quote_item")
@ApiModel(value = "QuoteItemEntity对象", description = "")
public class QuoteItemEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String quoteId;

    private String quoteItemSeqId;

    private String productId;

    private String productFeatureId;

    private String deliverableTypeId;

    private String skillTypeId;

    private String uomId;

    private String workEffortId;

    private String custRequestId;

    private String custRequestItemSeqId;

    private BigDecimal quantity;

    private BigDecimal selectedAmount;

    private BigDecimal quoteUnitPrice;

    private LocalDateTime reservStart;

    private BigDecimal reservLength;

    private BigDecimal reservPersons;

    private String configId;

    private LocalDateTime estimatedDeliveryDate;

    private String comments;

    private String isPromo;

    private BigDecimal leadTimeDays;


}
