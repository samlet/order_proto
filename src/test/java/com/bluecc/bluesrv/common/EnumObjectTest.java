package com.bluecc.bluesrv.common;

import lombok.Data;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Test;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static com.bluecc.bluesrv.common.Helper.pretty;

public class EnumObjectTest {
    @Data
    @Accessors(chain = true)
    public static class rtData{
        TestRoleType roleType;
    }

    @Test
    void testRoleTypes(){
        System.out.println(TestRoleType.NE);
        rtData data=new rtData().setRoleType(TestRoleType.HE);
        pretty(data);
        for (TestRoleType childType : TestRoleType.childTypes(TestRoleType.H.typeId)) {
            System.out.println(childType);
        }

        data=GSON.fromJson("{\"role_type\": \"HE\"}", rtData.class);
        System.out.println(data);

        TestRoleType.H.childTypes().forEach(e -> System.out.println(e));
    }

    @Test
    void testGenTypes(){
        RoleType.SFA_ROLE.childTypes().forEach(e -> System.out.println(e));
    }
}
