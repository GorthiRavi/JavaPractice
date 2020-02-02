package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class SumAndAverageInt {
    public static int sum(){
       return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double avg(){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {

        System.out.println("Summing Int :"+sum());
        System.out.println("AVeraing Int :"+avg());
    }
}
