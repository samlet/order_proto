package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public enum EnumerationType implements IEnumeration<EnumerationType>{
    EMPLOY_STTS("EMPLOY_STTS", "", "Employment Status"),
    MARITAL_STATUS("MARITAL_STATUS", "", "Marital Status"),
    PTY_RESID_STTS("PTY_RESID_STTS", "", "Residence Status"),
    PARTY_EMAIL("PARTY_EMAIL", "", "Party Email Notification"),
    USER_PREF_GROUPS("USER_PREF_GROUPS", "", "User preference groups"),
    GLOBAL_PREFERENCES("GLOBAL_PREFERENCES", "USER_PREF_GROUPS", "Global preferences"),
    ORDER_SALES_CHANNEL("ORDER_SALES_CHANNEL", "", "Order Sales Channel"),
    ODR_ITM_CHANGE_TYPE("ODR_ITM_CHANGE_TYPE", "", "Order Item Change Type"),
    ODR_ITM_CH_REASON("ODR_ITM_CH_REASON", "", "Order Item Change Reason"),
    ALLOC_PLAN_METHOD("ALLOC_PLAN_METHOD", "", "Allocation Plan Method"),
    GC_FULFILL("GC_FULFILL", "", "Gift Card Fulfillment"),
    PGT_CODE("PGT_CODE", "", "Payment Gateway Transaction Code"),
    FARP_TYPE("FARP_TYPE", "", "Financial Account Replenish Type"),
    FARP_METHOD("FARP_METHOD", "", "Financial Account Replenish Method"),
    FINACCT_TRANS_REASON("FINACCT_TRANS_REASON", "", "Service Debit Reasons"),
    FXAST_CLASS("FXAST_CLASS", "", "Fixed Asset Class"),
    FXAST_COMPU_HARDWARE("FXAST_COMPU_HARDWARE", "FXAST_CLASS", "Computer Hardware"),
    FXAST_COMPU_SOFTWARE("FXAST_COMPU_SOFTWARE", "FXAST_CLASS", "Computer Software"),
    TAXABLE_INV_ITM_TY("TAXABLE_INV_ITM_TY", "", "Taxable Invoice Item Types"),
    CREDIT_CARD_TYPE("CREDIT_CARD_TYPE", "", "Credit Card Type"),
    TAX_FORMS("TAX_FORMS", "", "Tax Forms"),
    COGS_METHODS("COGS_METHODS", "", "COGS Methods"),
    INVOICE_SEQMD("INVOICE_SEQMD", "", "Invoice Sequence Mode"),
    QUOTE_SEQMD("QUOTE_SEQMD", "", "Quote Sequence Mode"),
    ORDER_SEQMD("ORDER_SEQMD", "", "Order Sequence Mode"),
    PTSOFTTFR("PTSOFTTFR", "", "Points of Title Transfer"),
    STR_CRDT_ACT("STR_CRDT_ACT", "", "Store Credit Account")
    ;

    private static final Map<String, EnumerationType> BY_TYPE = new HashMap<>();
    private static final Multimap<String, EnumerationType> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (EnumerationType e : values()) {
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

    private EnumerationType(String typeId, String parentType, String description) {
        this.typeId = typeId;
        this.parentType = parentType;
        this.description = description;
    }

    public static EnumerationType valueOfType(String typeId) {
        return BY_TYPE.get(typeId);
    }

    public static Collection<EnumerationType> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }

    @Override
    public Collection<EnumerationType> childTypes(){
        return childTypes(this.typeId);
    }
}

