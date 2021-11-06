package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public enum ContactMechTypePurpose {
    BILLING_EMAIL("BILLING_EMAIL", "EMAIL_ADDRESS", ""),
    MARKETING_EMAIL("MARKETING_EMAIL", "EMAIL_ADDRESS", ""),
    PAYMENT_EMAIL("PAYMENT_EMAIL", "EMAIL_ADDRESS", ""),
    ORDER_EMAIL("ORDER_EMAIL", "EMAIL_ADDRESS", ""),
    OTHER_EMAIL("OTHER_EMAIL", "EMAIL_ADDRESS", ""),
    PRIMARY_EMAIL("PRIMARY_EMAIL", "EMAIL_ADDRESS", ""),
    SHIPPING_LOCATION("SHIPPING_LOCATION", "POSTAL_ADDRESS", ""),
    SHIP_ORIG_LOCATION("SHIP_ORIG_LOCATION", "POSTAL_ADDRESS", ""),
    BILLING_LOCATION("BILLING_LOCATION", "POSTAL_ADDRESS", ""),
    PAYMENT_LOCATION("PAYMENT_LOCATION", "POSTAL_ADDRESS", ""),
    GENERAL_LOCATION("GENERAL_LOCATION", "POSTAL_ADDRESS", ""),
    PUR_RET_LOCATION("PUR_RET_LOCATION", "POSTAL_ADDRESS", ""),
    PRIMARY_LOCATION("PRIMARY_LOCATION", "POSTAL_ADDRESS", ""),
    PREVIOUS_LOCATION("PREVIOUS_LOCATION", "POSTAL_ADDRESS", ""),
    FAX_NUMBER("FAX_NUMBER", "TELECOM_NUMBER", ""),
    FAX_NUMBER_SEC("FAX_NUMBER_SEC", "TELECOM_NUMBER", ""),
    PHONE_DID("PHONE_DID", "TELECOM_NUMBER", ""),
    PHONE_HOME("PHONE_HOME", "TELECOM_NUMBER", ""),
    PHONE_MOBILE("PHONE_MOBILE", "TELECOM_NUMBER", ""),
    PHONE_WORK("PHONE_WORK", "TELECOM_NUMBER", ""),
    PHONE_WORK_SEC("PHONE_WORK_SEC", "TELECOM_NUMBER", ""),
    PHONE_SHIPPING("PHONE_SHIPPING", "TELECOM_NUMBER", ""),
    PHONE_SHIP_ORIG("PHONE_SHIP_ORIG", "TELECOM_NUMBER", ""),
    PHONE_BILLING("PHONE_BILLING", "TELECOM_NUMBER", ""),
    PHONE_PAYMENT("PHONE_PAYMENT", "TELECOM_NUMBER", ""),
    PRIMARY_PHONE("PRIMARY_PHONE", "TELECOM_NUMBER", ""),
    PHONE_QUICK("PHONE_QUICK", "TELECOM_NUMBER", ""),
    FAX_SHIPPING("FAX_SHIPPING", "TELECOM_NUMBER", ""),
    FAX_BILLING("FAX_BILLING", "TELECOM_NUMBER", ""),
    PHONE_ASSISTANT("PHONE_ASSISTANT", "TELECOM_NUMBER", ""),
    PRIMARY_WEB_URL("PRIMARY_WEB_URL", "WEB_ADDRESS", ""),
    TWITTER_URL("TWITTER_URL", "WEB_ADDRESS", ""),
    FACEBOOK_URL("FACEBOOK_URL", "WEB_ADDRESS", ""),
    LINKEDIN_URL("LINKEDIN_URL", "WEB_ADDRESS", "")
    ;

    private static final Map<String, ContactMechTypePurpose> BY_TYPE = new HashMap<>();
    private static final Multimap<String, ContactMechTypePurpose> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (ContactMechTypePurpose e : values()) {
            BY_TYPE.put(e.typeId, e);
            BY_PARENT_TYPE.put(e.parentType, e);
        }
    }

    public final String typeId;
    public final String parentType;
    public final String description;

    private ContactMechTypePurpose(String typeId, String parentType, String description) {
        this.typeId = typeId;
        this.parentType = parentType;
        this.description = description;
    }

    public static ContactMechTypePurpose valueOfType(String typeId) {
        return BY_TYPE.get(typeId);
    }

    public static Collection<ContactMechTypePurpose> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }
    public Collection<ContactMechTypePurpose> childTypes(){
        return childTypes(this.typeId);
    }
}

