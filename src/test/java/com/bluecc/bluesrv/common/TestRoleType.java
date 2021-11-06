package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public enum TestRoleType {
    H("Hydrogen", "Base"),
    HE("Helium", "Hydrogen"),
    // ...
    NE("Neon", "Hydrogen");

    private static final Map<String, TestRoleType> BY_TYPE = new HashMap<>();
    private static final Multimap<String, TestRoleType> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (TestRoleType e : values()) {
            BY_TYPE.put(e.typeId, e);
            BY_PARENT_TYPE.put(e.parentType, e);
            System.out.println(e.parentType+" - "+e.typeId);
        }
    }

    public final String typeId;
    public final String parentType;

    private TestRoleType(String typeId, String parentType) {
        this.typeId = typeId;
        this.parentType = parentType;
    }

    public static TestRoleType valueOfLabel(String label) {
        return BY_TYPE.get(label);
    }

    public static Collection<TestRoleType> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }
    public Collection<TestRoleType> childTypes(){
        return childTypes(this.typeId);
    }
}

