package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipEx {

  public static Optional<Integer> limit(List<Integer> l){
      return l.stream()
              .limit(2)
              //1
              //3
              .reduce((x,y) -> x+y);
  }
    public static Optional<Integer> skip(List<Integer> l){
        return l.stream()
                .skip(2)
                //5
                //7
                //9
                .reduce((x,y) -> x+y);
    }
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,3,5,7,9);
        System.out.println("Limit 2 elements : "+ limit(l));
        System.out.println("skip 2 elements : "+ skip(l));
    }
}
