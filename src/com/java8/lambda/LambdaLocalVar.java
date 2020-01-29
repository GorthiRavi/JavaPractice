package com.java8.lambda;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

public class LambdaLocalVar {

    public static void main(String[] args) {

        int i = 2;
        // below code we cant use i in labmda because its local variable and can't re assign value also
        //Consumer<Integer> c = i -> System.out.println(i);


    }
}
