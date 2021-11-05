package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@TableName("fixed_asset")
@ApiModel(value = "FixedAssetEntity对象", description = "")
public class FixedAssetEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fixed_asset_id", type = IdType.ASSIGN_ID)
    private String fixedAssetId;

    private String fixedAssetTypeId;

    private String parentFixedAssetId;

    private String instanceOfProductId;

    private String classEnumId;

    private String partyId;

    private String roleTypeId;

    private String fixedAssetName;

    private String acquireOrderId;

    private String acquireOrderItemSeqId;

    private LocalDateTime dateAcquired;

    private LocalDateTime dateLastServiced;

    private LocalDateTime dateNextService;

    private LocalDate expectedEndOfLife;

    private LocalDate actualEndOfLife;

    private BigDecimal productionCapacity;

    private String uomId;

    private String calendarId;

    private String serialNumber;

    private String locatedAtFacilityId;

    private String locatedAtLocationSeqId;

    private BigDecimal salvageValue;

    private BigDecimal depreciation;

    private BigDecimal purchaseCost;

    private String purchaseCostUomId;


}
