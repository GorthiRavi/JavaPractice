package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MappingEx {

    public static void main(String[] args) {

        //with map method
        List<String> mapList = StudentDataBase.getAllStudents().stream()
                                .map(Student::getName).collect(toList());

        //Using mapping method
        List<String> mapingList = StudentDataBase.getAllStudents().stream()
                                  .collect(mapping(Student::getName,toList()));

        Set<String> mapingSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toSet()));


        System.out.println("Mapping : "+ mapingList);
    }
}
