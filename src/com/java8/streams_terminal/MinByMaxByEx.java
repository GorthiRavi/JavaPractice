package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;


public class MinByMaxByEx {

    public  static Optional<Student> minBy_ele(){

        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public  static Optional<Student> maxBy_ele(){

        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("Min By Value : "+minBy_ele().get());
        System.out.println("Max By Value : "+maxBy_ele().get());
    }
}
