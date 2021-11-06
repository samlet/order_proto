package com.bluecc.bluesrv.common;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class TestSource {
    public interface EnumParam {
        String getValue();
    }

    public enum SourceType implements EnumParam {
        @SerializedName("bank_account")
        BANK_ACCOUNT("bank_account"),

        @SerializedName("card")
        CARD("card"),

        @SerializedName("fpx")
        FPX("fpx");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SourceType(String value) {
            this.value = value;
        }
    }
}
