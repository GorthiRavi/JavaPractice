package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    static List<Student> list = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        Stream<Student> st = (Stream<Student>) list.stream()
                .peek(s -> {
                    System.out.println("After Converting list to Stream :" + s);
                })
                .filter(s -> s.getGradeLevel()>3)
                .peek(s -> {
                 System.out.println("After first Filter :" + s);
                  })
                .filter(s -> s.getGpa()>3.9)
               .peek(s -> {
               System.out.println("After Second Filter :" + s);
                })
                .collect(Collectors.toList());
        System.out.println(st);
    }
}
