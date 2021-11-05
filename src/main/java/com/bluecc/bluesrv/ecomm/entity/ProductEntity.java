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
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product")
@ApiModel(value = "ProductEntity对象", description = "")
public class ProductEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.ASSIGN_ID)
    private String productId;

    private String productTypeId;

    private String primaryProductCategoryId;

    private String facilityId;

    private LocalDateTime introductionDate;

    private LocalDateTime releaseDate;

    private LocalDateTime supportDiscontinuationDate;

    private LocalDateTime salesDiscontinuationDate;

    private String salesDiscWhenNotAvail;

    private String internalName;

    private String brandName;

    private String comments;

    private String productName;

    private String description;

    private String longDescription;

    private String priceDetailText;

    private String smallImageUrl;

    private String mediumImageUrl;

    private String largeImageUrl;

    private String detailImageUrl;

    private String originalImageUrl;

    private String detailScreen;

    private String inventoryMessage;

    private String inventoryItemTypeId;

    private String requireInventory;

    private String quantityUomId;

    private BigDecimal quantityIncluded;

    private BigDecimal piecesIncluded;

    private String requireAmount;

    private BigDecimal fixedAmount;

    private String amountUomTypeId;

    private String weightUomId;

    private BigDecimal shippingWeight;

    private BigDecimal productWeight;

    private String heightUomId;

    private BigDecimal productHeight;

    private BigDecimal shippingHeight;

    private String widthUomId;

    private BigDecimal productWidth;

    private BigDecimal shippingWidth;

    private String depthUomId;

    private BigDecimal productDepth;

    private BigDecimal shippingDepth;

    private String diameterUomId;

    private BigDecimal productDiameter;

    private BigDecimal productRating;

    private String ratingTypeEnum;

    private String returnable;

    private String taxable;

    private String chargeShipping;

    private String autoCreateKeywords;

    private String includeInPromotions;

    private String isVirtual;

    private String isVariant;

    private String virtualVariantMethodEnum;

    private String originGeoId;

    private String requirementMethodEnumId;

    private BigDecimal billOfMaterialLevel;

    private BigDecimal reservMaxPersons;

    private BigDecimal reserv2ndPPPerc;

    private BigDecimal reservNthPPPerc;

    private String configId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private String inShippingBox;

    private String defaultShipmentBoxTypeId;

    private String lotIdFilledIn;

    private String orderDecimalQuantity;


}
