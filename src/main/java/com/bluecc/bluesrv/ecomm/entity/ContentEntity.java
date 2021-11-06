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
@TableName("content")
@ApiModel(value = "ContentEntity对象", description = "")
public class ContentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "content_id", type = IdType.ASSIGN_ID)
    private String contentId;

    private String contentTypeId;

    private String ownerContentId;

    private String decoratorContentId;

    private String instanceOfContentId;

    private String dataResourceId;

    private String templateDataResourceId;

    private String dataSourceId;

    private String statusId;

    private String privilegeEnumId;

    private String serviceName;

    private String customMethodId;

    private String contentName;

    private String description;

    private String localeString;

    private String mimeTypeId;

    private String characterSetId;

    private BigDecimal childLeafCount;

    private BigDecimal childBranchCount;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;


}
