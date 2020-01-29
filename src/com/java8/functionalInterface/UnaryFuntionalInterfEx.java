package com.java8.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryFuntionalInterfEx {
// unary operator extends functional interf, if return type and input param is same, wecan use unary operator

   static UnaryOperator<String> u = s -> s.toUpperCase();

    public static void main(String[] args) {
        System.out.println(u.apply("Ravi"));
    }
}
