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
@TableName("product_review")
@ApiModel(value = "ProductReviewEntity对象", description = "")
public class ProductReviewEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_review_id", type = IdType.ASSIGN_ID)
    private String productReviewId;

    private String productStoreId;

    private String productId;

    private String userLoginId;

    private String statusId;

    private String postedAnonymous;

    private LocalDateTime postedDateTime;

    private BigDecimal productRating;

    private String productReview;


}
