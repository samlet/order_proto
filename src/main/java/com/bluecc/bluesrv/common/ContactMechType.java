package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public enum ContactMechType implements IEnumeration<ContactMechType>{
    ELECTRONIC_ADDRESS("ELECTRONIC_ADDRESS", "", "Electronic Address"),
    POSTAL_ADDRESS("POSTAL_ADDRESS", "", "Postal Address"),
    TELECOM_NUMBER("TELECOM_NUMBER", "", "Phone Number"),
    EMAIL_ADDRESS("EMAIL_ADDRESS", "ELECTRONIC_ADDRESS", "Email Address"),
    IP_ADDRESS("IP_ADDRESS", "ELECTRONIC_ADDRESS", "Internet IP Address"),
    DOMAIN_NAME("DOMAIN_NAME", "ELECTRONIC_ADDRESS", "Internet Domain Name"),
    WEB_ADDRESS("WEB_ADDRESS", "ELECTRONIC_ADDRESS", "Web URL/Address"),
    INTERNAL_PARTYID("INTERNAL_PARTYID", "ELECTRONIC_ADDRESS", "Internal Note via partyId"),
    FTP_ADDRESS("FTP_ADDRESS", "ELECTRONIC_ADDRESS", "Ftp server connection")
    ;

    private static final Map<String, ContactMechType> BY_TYPE = new HashMap<>();
    private static final Multimap<String, ContactMechType> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (ContactMechType e : values()) {
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

    private ContactMechType(String typeId, String parentType, String description) {
        this.typeId = typeId;
        this.parentType = parentType;
        this.description = description;
    }

    public static ContactMechType valueOfType(String typeId) {
        return BY_TYPE.get(typeId);
    }

    public static Collection<ContactMechType> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }

    @Override
    public Collection<ContactMechType> childTypes(){
        return childTypes(this.typeId);
    }
}

