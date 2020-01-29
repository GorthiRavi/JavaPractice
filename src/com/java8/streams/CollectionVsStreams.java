package com.java8.streams;

import java.util.ArrayList;

public class CollectionVsStreams {
// In collection we able to add , emove and modify elements, but in streams  we cant able to do addition and removing operations.
  // In collection can access elements any order like list.get(4) but in stream can access elements in sequence
    // Collections eagarly constructed but in streams lazily consructed (means if we not using terminal operation stream operations not worked).
    //Collections can traverse any num of times but streams only once
    // collections Perform external iteration for iterate elements, streams perform internal iteraion(using method)
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("ravi");
        l.add("Teja");
        l.add("aaa");
        l.remove(2);

    }
}
