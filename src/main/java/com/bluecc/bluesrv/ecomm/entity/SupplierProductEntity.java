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
@TableName("supplier_product")
@ApiModel(value = "SupplierProductEntity对象", description = "")
public class SupplierProductEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String productId;

    private String partyId;

    private LocalDateTime availableFromDate;

    private LocalDateTime availableThruDate;

    private String supplierPrefOrderId;

    private String supplierRatingTypeId;

    private BigDecimal standardLeadTimeDays;

    private BigDecimal minimumOrderQuantity;

    private BigDecimal orderQtyIncrements;

    private BigDecimal unitsIncluded;

    private String quantityUomId;

    private String agreementId;

    private String agreementItemSeqId;

    private BigDecimal lastPrice;

    private BigDecimal shippingPrice;

    private String currencyUomId;

    private String supplierProductName;

    private String supplierProductId;

    private String canDropShip;

    private String comments;


}
