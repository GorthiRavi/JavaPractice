package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxEx {

    public static int findMax(List<Integer> l){
       return l.stream()
               //1
               //3
               //5
               // ..
               //x value holds max value for each element in iteration
                .reduce(0, (x,y) -> x>y ? x :y);
    }
    public static Optional<Integer> findMaxWithoutDefault(List<Integer> l){
        return l.stream()
                .reduce((x,y) -> x>y ? x :y);
    }

    public static Optional<Integer> findMinWithoutDefault(List<Integer> l){
        return l.stream()
                .reduce((x,y) -> x<y ? x :y);
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,3,5,7,9);
     // if we pass empty list returns zero because we are using default value
        int maxValue = findMax(l);
        Optional<Integer> maxValue1 = findMaxWithoutDefault(l);
        Optional<Integer> minValue1 = findMinWithoutDefault(l);
        System.out.println("With default max value : " + maxValue);
        System.out.println("Without default max value : " + maxValue1.get()); // here we pass empty list get nullpointer
        System.out.println("Without default min value : " + minValue1.get());
    }
}
