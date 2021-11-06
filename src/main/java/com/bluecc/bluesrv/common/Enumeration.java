package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public enum Enumeration implements IEnumeration<Enumeration>{
    EMPS_FULLTIME("EMPS_FULLTIME", "EMPLOY_STTS", "Full-time Employed"),
    EMPS_PARTTIME("EMPS_PARTTIME", "EMPLOY_STTS", "Part-time Employed"),
    EMPS_SELF("EMPS_SELF", "EMPLOY_STTS", "Self Employed"),
    EMPS_HOUSE("EMPS_HOUSE", "EMPLOY_STTS", "House-Person"),
    EMPS_RETIRED("EMPS_RETIRED", "EMPLOY_STTS", "Retired"),
    EMPS_STUDENT("EMPS_STUDENT", "EMPLOY_STTS", "Student"),
    EMPS_UNEMP("EMPS_UNEMP", "EMPLOY_STTS", "Unemployed"),
    SINGLE("SINGLE", "MARITAL_STATUS", "Single"),
    MARRIED("MARRIED", "MARITAL_STATUS", "Married"),
    PRESS_OWN("PRESS_OWN", "PTY_RESID_STTS", "Own Home"),
    PRESS_PVT_TENANT("PRESS_PVT_TENANT", "PTY_RESID_STTS", "Private Tenant"),
    PRESS_PUB_TENANT("PRESS_PUB_TENANT", "PTY_RESID_STTS", "Public Tenant"),
    PRESS_PARENTS("PRESS_PARENTS", "PTY_RESID_STTS", "With Parents"),
    PARTY_REGIS_CONFIRM("PARTY_REGIS_CONFIRM", "PARTY_EMAIL", "Party Registration Confirmation"),
    UPD_PRSNL_INF_CNFRM("UPD_PRSNL_INF_CNFRM", "PARTY_EMAIL", "Update Personal Info Confirmation"),
    PRDS_EMAIL_VERIFY("PRDS_EMAIL_VERIFY", "PARTY_EMAIL", "Party Email Address Verification"),
    PRDS_PARTYINV_EMAIL("PRDS_PARTYINV_EMAIL", "PARTY_EMAIL", "Party Invitation"),
    CONT_NOTI_EMAIL("CONT_NOTI_EMAIL", "PARTY_EMAIL", "Contact-Us Notification"),
    PRDS_CUST_ACTIVATED("PRDS_CUST_ACTIVATED", "PARTY_EMAIL", "Account Activated Notification"),
    UNSUB_CONT_LIST_NOTI("UNSUB_CONT_LIST_NOTI", "PARTY_EMAIL", "Unsubscribe Contact List Notification"),
    SUB_CONT_LIST_NOTI("SUB_CONT_LIST_NOTI", "PARTY_EMAIL", "Subscribe Contact List Notification"),
    UNSUB_CONT_LIST_VERI("UNSUB_CONT_LIST_VERI", "PARTY_EMAIL", "Unsubscribe Contact List Verify"),
    CONT_EMAIL_TEMPLATE("CONT_EMAIL_TEMPLATE", "PARTY_EMAIL", "Contact List E-mail Template"),
    ORGANIZATION_PARTY("ORGANIZATION_PARTY", "GLOBAL_PREFERENCES", "Organization party"),
    VISUAL_THEME("VISUAL_THEME", "GLOBAL_PREFERENCES", "Visual Theme"),
    WEB_SALES_CHANNEL("WEB_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Web Channel"),
    FAX_SALES_CHANNEL("FAX_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Fax Channel"),
    PHONE_SALES_CHANNEL("PHONE_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Phone Channel"),
    EMAIL_SALES_CHANNEL("EMAIL_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "E-Mail Channel"),
    SNAIL_SALES_CHANNEL("SNAIL_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Snail Mail Channel"),
    AFFIL_SALES_CHANNEL("AFFIL_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Affiliate Channel"),
    EBAY_SALES_CHANNEL("EBAY_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "eBay Channel"),
    UNKNWN_SALES_CHANNEL("UNKNWN_SALES_CHANNEL", "ORDER_SALES_CHANNEL", "Unknown Channel"),
    ODR_ITM_UPDATE("ODR_ITM_UPDATE", "ODR_ITM_CHANGE_TYPE", "Order Item Update"),
    ODR_ITM_CANCEL("ODR_ITM_CANCEL", "ODR_ITM_CHANGE_TYPE", "Order Item Cancel"),
    ODR_ITM_APPEND("ODR_ITM_APPEND", "ODR_ITM_CHANGE_TYPE", "Order Item Append"),
    OICR_MISORDER_ITEM("OICR_MISORDER_ITEM", "ODR_ITM_CH_REASON", "Mis-Ordered Item"),
    OICR_CHANGE_MIND("OICR_CHANGE_MIND", "ODR_ITM_CH_REASON", "Changed Mind"),
    AUTO("AUTO", "ALLOC_PLAN_METHOD", "Auto"),
    MANUAL("MANUAL", "ALLOC_PLAN_METHOD", "Manual"),
    GC_ACTIVATE("GC_ACTIVATE", "GC_FULFILL", "Activate"),
    GC_RELOAD("GC_RELOAD", "GC_FULFILL", "Reload"),
    PGT_AUTHORIZE("PGT_AUTHORIZE", "PGT_CODE", "Authorize"),
    PGT_CAPTURE("PGT_CAPTURE", "PGT_CODE", "Capture"),
    PGT_RELEASE("PGT_RELEASE", "PGT_CODE", "Release"),
    PGT_REFUND("PGT_REFUND", "PGT_CODE", "Refund"),
    PGT_CREDIT("PGT_CREDIT", "PGT_CODE", "Credit"),
    FARP_AUTOMATIC("FARP_AUTOMATIC", "FARP_TYPE", "Automatic Replenish"),
    FARP_MANUAL("FARP_MANUAL", "FARP_TYPE", "Manual Replenish"),
    FARP_NONE("FARP_NONE", "FARP_TYPE", "No Replenish"),
    FARP_TOP_OFF("FARP_TOP_OFF", "FARP_METHOD", "Top-off"),
    FARP_REPLENISH_LEVEL("FARP_REPLENISH_LEVEL", "FARP_METHOD", "Replenish-level"),
    FATR_PURCHASE("FATR_PURCHASE", "FINACCT_TRANS_REASON", "Purchase"),
    FATR_IDEPOSIT("FATR_IDEPOSIT", "FINACCT_TRANS_REASON", "Initial Deposit"),
    FATR_REPLENISH("FATR_REPLENISH", "FINACCT_TRANS_REASON", "Replenishment"),
    FATR_REFUND("FATR_REFUND", "FINACCT_TRANS_REASON", "Refund"),
    FAC_BOAT("FAC_BOAT", "FXAST_CLASS", "Boat"),
    FAC_FORKLIFT("FAC_FORKLIFT", "FXAST_CLASS", "Forklift"),
    FAC_DIGGER("FAC_DIGGER", "FXAST_CLASS", "Digger"),
    FAC_MANLIFT("FAC_MANLIFT", "FXAST_CLASS", "Manlift"),
    FAC_SERVICE_BODY("FAC_SERVICE_BODY", "FXAST_CLASS", "Service Body"),
    FAC_TRACTOR("FAC_TRACTOR", "FXAST_CLASS", "Tractor"),
    FAC_PASSENGER("FAC_PASSENGER", "FXAST_CLASS", "Passenger Vehicle"),
    FAC_COMPRESSOR("FAC_COMPRESSOR", "FXAST_CLASS", "Compressor"),
    FAC_TRENCHER("FAC_TRENCHER", "FXAST_CLASS", "Trencher"),
    FAC_PULLER("FAC_PULLER", "FXAST_CLASS", "Puller"),
    FAC_MOBILE("FAC_MOBILE", "FXAST_CLASS", "Mobile"),
    FAC_TANKER("FAC_TANKER", "FXAST_CLASS", "Tanker"),
    FAC_REEL_STAND("FAC_REEL_STAND", "FXAST_CLASS", "Reel Stand"),
    FAC_DESKTOP("FAC_DESKTOP", "FXAST_COMPU_HARDWARE", "Desktop"),
    FAC_LAPTOP("FAC_LAPTOP", "FXAST_COMPU_HARDWARE", "Laptop"),
    FAC_MONITOR("FAC_MONITOR", "FXAST_COMPU_HARDWARE", "Monitor"),
    FAC_PRG_SOFTWARE("FAC_PRG_SOFTWARE", "FXAST_COMPU_SOFTWARE", "Programming Software"),
    FAC_SYS_SOFTWARE("FAC_SYS_SOFTWARE", "FXAST_COMPU_SOFTWARE", "System Software"),
    FAC_APP_SOFTWARE("FAC_APP_SOFTWARE", "FXAST_COMPU_SOFTWARE", "Application Software"),
    FAC_UTIL_SOFTWARE("FAC_UTIL_SOFTWARE", "FXAST_COMPU_SOFTWARE", "Utility Software"),
    INV_SALES_TAX("INV_SALES_TAX", "TAXABLE_INV_ITM_TY", "Sales Invoice Sales Tax"),
    ITM_SALES_TAX("ITM_SALES_TAX", "TAXABLE_INV_ITM_TY", "Sales Invoice Line Item Sales Tax"),
    PINV_SALES_TAX("PINV_SALES_TAX", "TAXABLE_INV_ITM_TY", "Purchase Invoice Sales Tax"),
    PITM_SALES_TAX("PITM_SALES_TAX", "TAXABLE_INV_ITM_TY", "Purchase Invoice Line Item Sales Tax"),
    CRT_SALES_TAX_ADJ("CRT_SALES_TAX_ADJ", "TAXABLE_INV_ITM_TY", "Customer Return Sales Tax Adjustment"),
    CCT_VISA("CCT_VISA", "CREDIT_CARD_TYPE", "Visa"),
    CCT_MASTERCARD("CCT_MASTERCARD", "CREDIT_CARD_TYPE", "Master Card"),
    CCT_AMERICANEXPRESS("CCT_AMERICANEXPRESS", "CREDIT_CARD_TYPE", "American Express"),
    CCT_DINERSCLUB("CCT_DINERSCLUB", "CREDIT_CARD_TYPE", "Diners Club"),
    CCT_DISCOVER("CCT_DISCOVER", "CREDIT_CARD_TYPE", "Discover"),
    CCT_ENROUTE("CCT_ENROUTE", "CREDIT_CARD_TYPE", "EnRoute"),
    CCT_CARTEBLANCHE("CCT_CARTEBLANCHE", "CREDIT_CARD_TYPE", "Carte Blanche"),
    CCT_JCB("CCT_JCB", "CREDIT_CARD_TYPE", "JCB"),
    CCT_SOLO("CCT_SOLO", "CREDIT_CARD_TYPE", "Solo"),
    CCT_SWITCH("CCT_SWITCH", "CREDIT_CARD_TYPE", "Switch"),
    CCT_VISAELECTRON("CCT_VISAELECTRON", "CREDIT_CARD_TYPE", "Visa Electron"),
    CCT_UATP("CCT_UATP", "CREDIT_CARD_TYPE", "Universal Air Travel Plan"),
    US_IRS_1120("US_IRS_1120", "TAX_FORMS", "Form 1120 (US IRS)"),
    US_IRS_1120S("US_IRS_1120S", "TAX_FORMS", "Form 1120S (US IRS)"),
    US_IRS_1065("US_IRS_1065", "TAX_FORMS", "Form 1065 (US IRS)"),
    US_IRS_990("US_IRS_990", "TAX_FORMS", "Form 990 (US IRS)"),
    US_IRS_990PF("US_IRS_990PF", "TAX_FORMS", "Form 990-PF (US IRS)"),
    US_IRS_990T("US_IRS_990T", "TAX_FORMS", "Form 990-T (US IRS)"),
    US_IRS_1040("US_IRS_1040", "TAX_FORMS", "Form 1040 (US IRS)"),
    COGS_LIFO("COGS_LIFO", "COGS_METHODS", "LIFO"),
    COGS_FIFO("COGS_FIFO", "COGS_METHODS", "FIFO"),
    COGS_AVG_COST("COGS_AVG_COST", "COGS_METHODS", "Average Cost"),
    COGS_INV_COST("COGS_INV_COST", "COGS_METHODS", "Inventory Item Cost"),
    INVSQ_STANDARD("INVSQ_STANDARD", "INVOICE_SEQMD", "Standard (faster, may have gaps, per system)"),
    INVSQ_ENF_SEQ("INVSQ_ENF_SEQ", "INVOICE_SEQMD", "Enforced Sequence (no gaps, per organization)"),
    INVSQ_RESTARTYR("INVSQ_RESTARTYR", "INVOICE_SEQMD", "Restart on Fiscal Year (no gaps, per org, reset to 1 each year)"),
    QTESQ_STANDARD("QTESQ_STANDARD", "QUOTE_SEQMD", "Standard (faster, may have gaps, per system)"),
    QTESQ_ENF_SEQ("QTESQ_ENF_SEQ", "QUOTE_SEQMD", "Enforced Sequence (no gaps, per organization)"),
    ODRSQ_STANDARD("ODRSQ_STANDARD", "ORDER_SEQMD", "Standard (faster, may have gaps, per system)"),
    ODRSQ_ENF_SEQ("ODRSQ_ENF_SEQ", "ORDER_SEQMD", "Enforced Sequence (no gaps, per organization)"),
    POTT_DEST("POTT_DEST", "PTSOFTTFR", "Desination"),
    POTT_ORIG("POTT_ORIG", "PTSOFTTFR", "Origin"),
    POTT_INTR("POTT_INTR", "PTSOFTTFR", "In Transit"),
    POTT_EXW("POTT_EXW", "PTSOFTTFR", "EX-Works"),
    POTT_FOB("POTT_FOB", "PTSOFTTFR", "Free On Board"),
    POTT_FCA("POTT_FCA", "PTSOFTTFR", "Free Carrier"),
    POTT_FAS("POTT_FAS", "PTSOFTTFR", "Free Alongside Ship"),
    POTT_CFR("POTT_CFR", "PTSOFTTFR", "Cost and Freight"),
    POTT_CIF("POTT_CIF", "PTSOFTTFR", "Cost, Insurance and Freight"),
    POTT_CPT("POTT_CPT", "PTSOFTTFR", "Carriage Paid To"),
    POTT_CIP("POTT_CIP", "PTSOFTTFR", "Carriage and Insurance Paid To"),
    POTT_DAF("POTT_DAF", "PTSOFTTFR", "Delivered At Frontier"),
    POTT_DES("POTT_DES", "PTSOFTTFR", "Delivered Ex Ship"),
    POTT_DEQ("POTT_DEQ", "PTSOFTTFR", "Delivered Ex Quay"),
    POTT_DDP("POTT_DDP", "PTSOFTTFR", "Delivered Duty Paid"),
    POTT_DDQ("POTT_DDQ", "PTSOFTTFR", "Delivered Duty Unpaid"),
    FIN_ACCOUNT("FIN_ACCOUNT", "STR_CRDT_ACT", "Financial Account"),
    BILLING_ACCOUNT("BILLING_ACCOUNT", "STR_CRDT_ACT", "Billing Account")
    ;

    private static final Map<String, Enumeration> BY_TYPE = new HashMap<>();
    private static final Multimap<String, Enumeration> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (Enumeration e : values()) {
            BY_TYPE.put(e.typeId, e);
            BY_PARENT_TYPE.put(e.parentType, e);
        }
    }

    @Getter(onMethod_ = {@Override})
    public final String typeId;
    @Getter(onMethod_ = {@Override})
    public final String parentType;
    @Getter(onMethod_ = {@Override})
    public final String description;

    private Enumeration(String typeId, String parentType, String description) {
        this.typeId = typeId;
        this.parentType = parentType;
        this.description = description;
    }

    public static Enumeration valueOfType(String typeId) {
        return BY_TYPE.get(typeId);
    }

    public static Collection<Enumeration> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }

    @Override
    public Collection<Enumeration> childTypes(){
        return childTypes(this.typeId);
    }
}

