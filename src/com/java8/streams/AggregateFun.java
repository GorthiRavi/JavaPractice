package com.java8.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class AggregateFun {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum : "+ sum);
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("MAx : "+ max.getAsInt());
        OptionalLong min = LongStream.rangeClosed(1,50).min();
        System.out.println("Min : "+ min.getAsLong());
        OptionalDouble avg = IntStream.rangeClosed(1,50).asDoubleStream().average();
        System.out.println("Min : "+ avg.getAsDouble());

        OptionalInt max1 = IntStream.rangeClosed(0,0).max();
        System.out.println(max1.isPresent() ? max1.getAsInt() : 0 );
    }
}
