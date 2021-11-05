package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("data_resource")
@ApiModel(value = "DataResourceEntity对象", description = "")
public class DataResourceEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "data_resource_id", type = IdType.ASSIGN_ID)
    private String dataResourceId;

    private String dataResourceTypeId;

    private String dataTemplateTypeId;

    private String dataCategoryId;

    private String dataSourceId;

    private String statusId;

    private String dataResourceName;

    private String localeString;

    private String mimeTypeId;

    private String characterSetId;

    private String objectInfo;

    private String surveyId;

    private String surveyResponseId;

    private String relatedDetailId;

    private String isPublic;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
