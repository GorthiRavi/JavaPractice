package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapEX {

    public static List<String> listStu(){
        return StudentDataBase.getAllStudents().stream()
                //Getting student obj -> StudentName (return string by using map())
                .map(Student::getName)  // Stream<Student> -> Stream<String> Converting student obj to string
                .map(s -> s.toUpperCase())  // Stream<String> -> upper case operation on each element
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(listStu());
    }
}
