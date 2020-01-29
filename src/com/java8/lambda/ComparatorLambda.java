package com.java8.lambda;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // o1==o2 -> 0
                                        // o1>o2 -> 1
                                       // o1<o2 -> -1
            }
        };
        System.out.println("Result of comparator : "+ comp.compare(2,3));

        //java 8
        Comparator<Integer> comp1 = (o1,o2) -> o1.compareTo(o2);
        System.out.println("Result of comparator with lambda : " + comp1.compare(4,3));


    }
}
