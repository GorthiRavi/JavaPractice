package com.java8.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    // unary operator extends BiFunctional interf, if return type and input param is same, wecan use unary operator

    static BinaryOperator<Integer> b = (i1,i2) -> i1+i2;

    public static void main(String[] args) {
        System.out.println(b.apply(2,3));
    }
}
