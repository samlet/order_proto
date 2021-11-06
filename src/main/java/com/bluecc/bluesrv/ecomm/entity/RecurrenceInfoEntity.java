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
@TableName("recurrence_info")
@ApiModel(value = "RecurrenceInfoEntity对象", description = "")
public class RecurrenceInfoEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "recurrence_info_id", type = IdType.ASSIGN_ID)
    private String recurrenceInfoId;

    private LocalDateTime startDateTime;

    private String exceptionDateTimes;

    private String recurrenceDateTimes;

    private String exceptionRuleId;

    private String recurrenceRuleId;

    private BigDecimal recurrenceCount;


}
