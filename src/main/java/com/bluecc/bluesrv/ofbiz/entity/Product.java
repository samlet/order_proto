package com.bluecc.bluesrv.ofbiz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author samlet
 * @since 2021-11-05
 */
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private String inShippingBox;

    private String defaultShipmentBoxTypeId;

    private String lotIdFilledIn;

    private String orderDecimalQuantity;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getPrimaryProductCategoryId() {
        return primaryProductCategoryId;
    }

    public void setPrimaryProductCategoryId(String primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public LocalDateTime getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(LocalDateTime introductionDate) {
        this.introductionDate = introductionDate;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }

    public void setSupportDiscontinuationDate(LocalDateTime supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }

    public LocalDateTime getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }

    public void setSalesDiscontinuationDate(LocalDateTime salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }

    public String getSalesDiscWhenNotAvail() {
        return salesDiscWhenNotAvail;
    }

    public void setSalesDiscWhenNotAvail(String salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPriceDetailText() {
        return priceDetailText;
    }

    public void setPriceDetailText(String priceDetailText) {
        this.priceDetailText = priceDetailText;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    public String getInventoryMessage() {
        return inventoryMessage;
    }

    public void setInventoryMessage(String inventoryMessage) {
        this.inventoryMessage = inventoryMessage;
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }

    public String getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory;
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public BigDecimal getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(BigDecimal quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public BigDecimal getPiecesIncluded() {
        return piecesIncluded;
    }

    public void setPiecesIncluded(BigDecimal piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }

    public String getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(String requireAmount) {
        this.requireAmount = requireAmount;
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public String getAmountUomTypeId() {
        return amountUomTypeId;
    }

    public void setAmountUomTypeId(String amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId;
    }

    public String getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }

    public BigDecimal getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(BigDecimal shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public String getHeightUomId() {
        return heightUomId;
    }

    public void setHeightUomId(String heightUomId) {
        this.heightUomId = heightUomId;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public BigDecimal getShippingHeight() {
        return shippingHeight;
    }

    public void setShippingHeight(BigDecimal shippingHeight) {
        this.shippingHeight = shippingHeight;
    }

    public String getWidthUomId() {
        return widthUomId;
    }

    public void setWidthUomId(String widthUomId) {
        this.widthUomId = widthUomId;
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getShippingWidth() {
        return shippingWidth;
    }

    public void setShippingWidth(BigDecimal shippingWidth) {
        this.shippingWidth = shippingWidth;
    }

    public String getDepthUomId() {
        return depthUomId;
    }

    public void setDepthUomId(String depthUomId) {
        this.depthUomId = depthUomId;
    }

    public BigDecimal getProductDepth() {
        return productDepth;
    }

    public void setProductDepth(BigDecimal productDepth) {
        this.productDepth = productDepth;
    }

    public BigDecimal getShippingDepth() {
        return shippingDepth;
    }

    public void setShippingDepth(BigDecimal shippingDepth) {
        this.shippingDepth = shippingDepth;
    }

    public String getDiameterUomId() {
        return diameterUomId;
    }

    public void setDiameterUomId(String diameterUomId) {
        this.diameterUomId = diameterUomId;
    }

    public BigDecimal getProductDiameter() {
        return productDiameter;
    }

    public void setProductDiameter(BigDecimal productDiameter) {
        this.productDiameter = productDiameter;
    }

    public BigDecimal getProductRating() {
        return productRating;
    }

    public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }

    public String getRatingTypeEnum() {
        return ratingTypeEnum;
    }

    public void setRatingTypeEnum(String ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum;
    }

    public String getReturnable() {
        return returnable;
    }

    public void setReturnable(String returnable) {
        this.returnable = returnable;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public String getChargeShipping() {
        return chargeShipping;
    }

    public void setChargeShipping(String chargeShipping) {
        this.chargeShipping = chargeShipping;
    }

    public String getAutoCreateKeywords() {
        return autoCreateKeywords;
    }

    public void setAutoCreateKeywords(String autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords;
    }

    public String getIncludeInPromotions() {
        return includeInPromotions;
    }

    public void setIncludeInPromotions(String includeInPromotions) {
        this.includeInPromotions = includeInPromotions;
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getIsVariant() {
        return isVariant;
    }

    public void setIsVariant(String isVariant) {
        this.isVariant = isVariant;
    }

    public String getVirtualVariantMethodEnum() {
        return virtualVariantMethodEnum;
    }

    public void setVirtualVariantMethodEnum(String virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum;
    }

    public String getOriginGeoId() {
        return originGeoId;
    }

    public void setOriginGeoId(String originGeoId) {
        this.originGeoId = originGeoId;
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

    public BigDecimal getBillOfMaterialLevel() {
        return billOfMaterialLevel;
    }

    public void setBillOfMaterialLevel(BigDecimal billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }

    public BigDecimal getReservMaxPersons() {
        return reservMaxPersons;
    }

    public void setReservMaxPersons(BigDecimal reservMaxPersons) {
        this.reservMaxPersons = reservMaxPersons;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public String getInShippingBox() {
        return inShippingBox;
    }

    public void setInShippingBox(String inShippingBox) {
        this.inShippingBox = inShippingBox;
    }

    public String getDefaultShipmentBoxTypeId() {
        return defaultShipmentBoxTypeId;
    }

    public void setDefaultShipmentBoxTypeId(String defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
    }

    public String getLotIdFilledIn() {
        return lotIdFilledIn;
    }

    public void setLotIdFilledIn(String lotIdFilledIn) {
        this.lotIdFilledIn = lotIdFilledIn;
    }

    public String getOrderDecimalQuantity() {
        return orderDecimalQuantity;
    }

    public void setOrderDecimalQuantity(String orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    @Override
    public String toString() {
        return "Product{" +
        "productId=" + productId +
        ", productTypeId=" + productTypeId +
        ", primaryProductCategoryId=" + primaryProductCategoryId +
        ", facilityId=" + facilityId +
        ", introductionDate=" + introductionDate +
        ", releaseDate=" + releaseDate +
        ", supportDiscontinuationDate=" + supportDiscontinuationDate +
        ", salesDiscontinuationDate=" + salesDiscontinuationDate +
        ", salesDiscWhenNotAvail=" + salesDiscWhenNotAvail +
        ", internalName=" + internalName +
        ", brandName=" + brandName +
        ", comments=" + comments +
        ", productName=" + productName +
        ", description=" + description +
        ", longDescription=" + longDescription +
        ", priceDetailText=" + priceDetailText +
        ", smallImageUrl=" + smallImageUrl +
        ", mediumImageUrl=" + mediumImageUrl +
        ", largeImageUrl=" + largeImageUrl +
        ", detailImageUrl=" + detailImageUrl +
        ", originalImageUrl=" + originalImageUrl +
        ", detailScreen=" + detailScreen +
        ", inventoryMessage=" + inventoryMessage +
        ", inventoryItemTypeId=" + inventoryItemTypeId +
        ", requireInventory=" + requireInventory +
        ", quantityUomId=" + quantityUomId +
        ", quantityIncluded=" + quantityIncluded +
        ", piecesIncluded=" + piecesIncluded +
        ", requireAmount=" + requireAmount +
        ", fixedAmount=" + fixedAmount +
        ", amountUomTypeId=" + amountUomTypeId +
        ", weightUomId=" + weightUomId +
        ", shippingWeight=" + shippingWeight +
        ", productWeight=" + productWeight +
        ", heightUomId=" + heightUomId +
        ", productHeight=" + productHeight +
        ", shippingHeight=" + shippingHeight +
        ", widthUomId=" + widthUomId +
        ", productWidth=" + productWidth +
        ", shippingWidth=" + shippingWidth +
        ", depthUomId=" + depthUomId +
        ", productDepth=" + productDepth +
        ", shippingDepth=" + shippingDepth +
        ", diameterUomId=" + diameterUomId +
        ", productDiameter=" + productDiameter +
        ", productRating=" + productRating +
        ", ratingTypeEnum=" + ratingTypeEnum +
        ", returnable=" + returnable +
        ", taxable=" + taxable +
        ", chargeShipping=" + chargeShipping +
        ", autoCreateKeywords=" + autoCreateKeywords +
        ", includeInPromotions=" + includeInPromotions +
        ", isVirtual=" + isVirtual +
        ", isVariant=" + isVariant +
        ", virtualVariantMethodEnum=" + virtualVariantMethodEnum +
        ", originGeoId=" + originGeoId +
        ", requirementMethodEnumId=" + requirementMethodEnumId +
        ", billOfMaterialLevel=" + billOfMaterialLevel +
        ", reservMaxPersons=" + reservMaxPersons +
        ", reserv2ndPPPerc=" + reserv2ndPPPerc +
        ", reservNthPPPerc=" + reservNthPPPerc +
        ", configId=" + configId +
        ", createdDate=" + createdDate +
        ", createdByUserLogin=" + createdByUserLogin +
        ", lastModifiedDate=" + lastModifiedDate +
        ", lastModifiedByUserLogin=" + lastModifiedByUserLogin +
        ", inShippingBox=" + inShippingBox +
        ", defaultShipmentBoxTypeId=" + defaultShipmentBoxTypeId +
        ", lotIdFilledIn=" + lotIdFilledIn +
        ", orderDecimalQuantity=" + orderDecimalQuantity +
        ", lastUpdatedStamp=" + lastUpdatedStamp +
        ", lastUpdatedTxStamp=" + lastUpdatedTxStamp +
        ", createdStamp=" + createdStamp +
        ", createdTxStamp=" + createdTxStamp +
        "}";
    }
}
