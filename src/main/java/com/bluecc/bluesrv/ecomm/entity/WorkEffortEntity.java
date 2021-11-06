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
@TableName("work_effort")
@ApiModel(value = "WorkEffortEntity对象", description = "")
public class WorkEffortEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "work_effort_id", type = IdType.ASSIGN_ID)
    private String workEffortId;

    private String workEffortTypeId;

    private String currentStatusId;

    private LocalDateTime lastStatusUpdate;

    private String workEffortPurposeTypeId;

    private String workEffortParentId;

    private String scopeEnumId;

    private BigDecimal priority;

    private BigDecimal percentComplete;

    private String workEffortName;

    private String showAsEnumId;

    private String sendNotificationEmail;

    private String description;

    private String locationDesc;

    private LocalDateTime estimatedStartDate;

    private LocalDateTime estimatedCompletionDate;

    private LocalDateTime actualStartDate;

    private LocalDateTime actualCompletionDate;

    private Double estimatedMilliSeconds;

    private Double estimatedSetupMillis;

    private String estimateCalcMethod;

    private Double actualMilliSeconds;

    private Double actualSetupMillis;

    private Double totalMilliSecondsAllowed;

    private BigDecimal totalMoneyAllowed;

    private String moneyUomId;

    private String specialTerms;

    private BigDecimal timeTransparency;

    private String universalId;

    private String sourceReferenceId;

    private String fixedAssetId;

    private String facilityId;

    private String infoUrl;

    private String recurrenceInfoId;

    private String tempExprId;

    private String runtimeDataId;

    private String noteId;

    private String serviceLoaderName;

    private BigDecimal quantityToProduce;

    private BigDecimal quantityProduced;

    private BigDecimal quantityRejected;

    private BigDecimal reservPersons;

    private BigDecimal reserv2ndPPPerc;

    private BigDecimal reservNthPPPerc;

    private String accommodationMapId;

    private String accommodationSpotId;

    private BigDecimal revisionNumber;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private BigDecimal sequenceNum;


}
