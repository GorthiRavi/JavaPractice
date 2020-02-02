package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxing {

    public static List<Integer> boxing(){
        return IntStream.
                rangeClosed(1,50) // IntStream of 10 elements
                .boxed() // int to Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> list){
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {

        System.out.println("Bxing value :" + boxing());
        System.out.println("Unboxing value "+ unBoxing(Arrays.asList(1,2,3,4,5)));
    }
}
