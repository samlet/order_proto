package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("product_store")
@ApiModel(value = "ProductStoreEntity对象", description = "")
public class ProductStoreEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_store_id", type = IdType.ASSIGN_ID)
    private String productStoreId;

    private String primaryStoreGroupId;

    private String storeName;

    private String companyName;

    private String title;

    private String subtitle;

    private String payToPartyId;

    private BigDecimal daysToCancelNonPay;

    private String manualAuthIsCapture;

    private String prorateShipping;

    private String prorateTaxes;

    private String viewCartOnAdd;

    private String autoSaveCart;

    private String autoApproveReviews;

    private String isDemoStore;

    private String isImmediatelyFulfilled;

    private String inventoryFacilityId;

    private String oneInventoryFacility;

    private String checkInventory;

    private String reserveInventory;

    private String reserveOrderEnumId;

    private String requireInventory;

    private String balanceResOnOrderCreation;

    private String requirementMethodEnumId;

    private String orderNumberPrefix;

    private String defaultLocaleString;

    private String defaultCurrencyUomId;

    private String defaultTimeZoneString;

    private String defaultSalesChannelEnumId;

    private String allowPassword;

    private String defaultPassword;

    private String explodeOrderItems;

    private String checkGcBalance;

    private String retryFailedAuths;

    private String headerApprovedStatus;

    private String itemApprovedStatus;

    private String digitalItemApprovedStatus;

    private String headerDeclinedStatus;

    private String itemDeclinedStatus;

    private String headerCancelStatus;

    private String itemCancelStatus;

    private String authDeclinedMessage;

    private String authFraudMessage;

    private String authErrorMessage;

    private String visualThemeId;

    private String storeCreditAccountEnumId;

    private String usePrimaryEmailUsername;

    private String requireCustomerRole;

    private String autoInvoiceDigitalItems;

    private String reqShipAddrForDigItems;

    private String showCheckoutGiftOptions;

    private String selectPaymentTypePerItem;

    private String showPricesWithVatTax;

    private String showTaxIsExempt;

    private String vatTaxAuthGeoId;

    private String vatTaxAuthPartyId;

    private String enableAutoSuggestionList;

    private String enableDigProdUpload;

    private String prodSearchExcludeVariants;

    private String digProdUploadCategoryId;

    private String autoOrderCcTryExp;

    private String autoOrderCcTryOtherCards;

    private String autoOrderCcTryLaterNsf;

    private BigDecimal autoOrderCcTryLaterMax;

    private BigDecimal storeCreditValidDays;

    private String autoApproveInvoice;

    private String autoApproveOrder;

    private String shipIfCaptureFails;

    private String setOwnerUponIssuance;

    private String reqReturnInventoryReceive;

    private String addToCartRemoveIncompat;

    private String addToCartReplaceUpsell;

    private String splitPayPrefPerShpGrp;

    private String managedByLot;

    private String showOutOfStockProducts;

    private String orderDecimalQuantity;

    private String allowComment;

    private String styleSheet;

    private String headerLogo;

    private String headerMiddleBackground;

    private String headerRightBackground;

    private String allocateInventory;


}
