package com.bluecc.bluesrv.ecomm.feed;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class FeederBase {
    protected Faker faker;
    public FeederBase() {
        faker = new Faker(new Locale("zh-CN"));
    }

    protected List<String> indicator= Arrays.asList("Y", "N");
    protected DefaultIdentifierGenerator identifierGenerator = new DefaultIdentifierGenerator();
    protected Random rand = new Random();
    protected <T> T choose(List<T> givenList){
        return givenList.get(rand.nextInt(givenList.size()));
    }

    protected String randId(){
        return identifierGenerator.nextId(null).toString();
    }

    protected String randRangeId(int max){
        return String.valueOf(rand.nextInt(max));
    }

    protected BigDecimal randDecimal(int min, int max){
        return BigDecimal.valueOf(RandomNum.getRandInt(min, max));
    }

}
