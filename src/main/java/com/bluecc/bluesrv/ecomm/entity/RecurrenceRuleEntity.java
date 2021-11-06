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
@TableName("recurrence_rule")
@ApiModel(value = "RecurrenceRuleEntity对象", description = "")
public class RecurrenceRuleEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "recurrence_rule_id", type = IdType.ASSIGN_ID)
    private String recurrenceRuleId;

    private String frequency;

    private LocalDateTime untilDateTime;

    private BigDecimal countNumber;

    private BigDecimal intervalNumber;

    private String bySecondList;

    private String byMinuteList;

    private String byHourList;

    private String byDayList;

    private String byMonthDayList;

    private String byYearDayList;

    private String byWeekNoList;

    private String byMonthList;

    private String bySetPosList;

    private String weekStart;

    private String xName;


}
