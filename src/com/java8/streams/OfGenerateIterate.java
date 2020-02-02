package com.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfGenerateIterate {


    public static void main(String[] args) {
       Stream<String> str = Stream.of("Ravi", "teja", "iran");
       str.forEach(System.out::println);
       Stream.iterate(1, x -> x*2)
               .limit(5)
       .forEach(System.out::println);
        Supplier<Integer> sup = new Random()::nextInt;
        Stream.generate(sup)
                .limit(5)
                .forEach(System.out::println);

    }
}
