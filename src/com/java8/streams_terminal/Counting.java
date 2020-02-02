package com.java8.streams_terminal;

import com.pojo.StudentDataBase;

import java.util.stream.Collectors;

public class Counting {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.counting());

        //return StudentDataBase.getAllStudents().stream().collect(counting());
    }
    public static void main(String[] args) {
        System.out.println("Counting : "+count());
    }
}
