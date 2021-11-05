package com.bluecc.bluesrv.common;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class FunctionalTest {
    @Test
    void compose(){
        // https://www.baeldung.com/java-functional-programming#1-function-composition
        Function<Double, Double> log = (value) -> Math.log(value);
        Function<Double, Double> sqrt = (value) -> Math.sqrt(value);
        Function<Double, Double> logThenSqrt = sqrt.compose(log);
        System.out.println( String.valueOf(logThenSqrt.apply(3.14)));
        // Output: 1.06
        Function<Double, Double> sqrtThenLog = sqrt.andThen(log);
        System.out.println( String.valueOf(sqrtThenLog.apply(3.14)));
        // Output: 0.57

        // 柯里化可将接受多个参数的函数转换为接受单个参数的函数序列
        Function<Double, Function<Double, Double>> weight = mass -> gravity -> mass * gravity;

        Function<Double, Double> weightOnEarth = weight.apply(9.81);
        System.out.println( "My weight on Earth: " + weightOnEarth.apply(60.0));

        Function<Double, Double> weightOnMars = weight.apply(3.75);
        System.out.println( "My weight on Mars: " + weightOnMars.apply(60.0));
    }

    private static Function<Double, Double> weightOnEarth() {
        final double gravity = 9.81;
        return mass -> mass * gravity;
    }
}
