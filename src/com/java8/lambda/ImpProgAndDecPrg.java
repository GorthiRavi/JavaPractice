package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImpProgAndDecPrg {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,3,4,5,6,6,7,8);
        //remove duplicates from list
        //1. imperative approach

        List<Integer> uniqList = new ArrayList<>();
        for (Integer i : list1) {
            if(!uniqList.contains(i)){
                uniqList.add(i);
            }
        }
        System.out.println(uniqList);

        //Declarative approach
        List<Integer> uniqList1 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqList1);
    }

}
