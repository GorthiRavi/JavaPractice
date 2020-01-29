package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEx {
public static List<Student> sortStudentsByName(){
    return StudentDataBase.getAllStudents().stream()
            .sorted(Comparator.comparing(Student::getName))
            .collect(Collectors.toList());
}

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted((Comparator.comparing(Student::getGpa)).reversed())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println("Students Sorted By Name");
        sortStudentsByName().forEach(System.out::println);
    }
}
