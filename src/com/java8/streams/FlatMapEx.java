package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

public static List<String> getAllActivities(){

    List<String>lis = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)  //Stream<List<String>>
            .flatMap(List::stream)  //Stream<String>
            .collect(Collectors.toList());
    return lis;
}

    public static void main(String[] args) {
        System.out.println(getAllActivities());
    }
}
