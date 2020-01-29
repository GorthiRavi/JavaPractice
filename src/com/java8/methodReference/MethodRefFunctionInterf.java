package com.java8.methodReference;

import java.util.function.Function;

public class MethodRefFunctionInterf {

    static Function<String,String> fun1 = s -> s.toUpperCase();
    static Function<String,String> fun2 = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(fun2.apply("ravi"));
    }
}

