package com.bluecc.bluesrv.common;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static com.bluecc.bluesrv.common.Helper.GSON;

public class JsonSerializeTest {
    @Data
    static class Stuff{
        Date birthday=new Date();
    }

    @Test
    void testDate(){
        System.out.println(GSON.toJson(new Stuff()));
    }
}
