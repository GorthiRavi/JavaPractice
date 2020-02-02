package com.java8.streams;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {

    public static int NumOfNnums(List<Integer> lis){
        return lis.stream()
                .reduce(1, (x,y) -> x*y); //here unboxing every value Integer to int
    }

    public static int NumOfIntStreams(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of N Numbers " + NumOfNnums(in));
        System.out.println("Sum of NumOfIntStreams " + NumOfIntStreams());

        //range(1,50) will considered from 1 to 49
        System.out.println("IntStream Range value : " );
        IntStream.range(1,50).forEach(System.out::println);
        System.out.println("IntStream Range Count : " + IntStream.range(1,50).count());
        //rangeClosed(1,50) will considered from 1 to 50
        IntStream.rangeClosed(1,50).forEach(System.out::println);
        System.out.println("IntStream Range Count : " + IntStream.rangeClosed(1,50).count());

        //Same as for long
        System.out.println("LongStream Range value : " );
        LongStream.range(1,50).forEach(System.out::println);
        //rangeClosed(1,50) will considered from 1 to 50
        System.out.println("LongStream Range Count  : " + LongStream.range(1,50).count());

        //For Double
        System.out.println("DoubleStream Range value : " );
        LongStream.range(1,50).asDoubleStream().forEach(System.out::println);
    }
}
