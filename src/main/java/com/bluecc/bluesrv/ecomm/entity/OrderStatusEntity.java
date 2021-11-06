package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_status")
@ApiModel(value = "OrderStatusEntity对象", description = "")
public class OrderStatusEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_status_id", type = IdType.ASSIGN_ID)
    private String orderStatusId;

    private String statusId;

    private String orderId;

    private String orderItemSeqId;

    private String orderPaymentPreferenceId;

    private LocalDateTime statusDatetime;

    private String statusUserLogin;

    private String changeReason;


}
