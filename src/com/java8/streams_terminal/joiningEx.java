package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.stream.Collectors;

class JoiningEx {
    public static String join_delimeter(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String join(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String join_Pre_suffix(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }
    
    public static void main(String[] args) {
        System.out.println("Joining method : "+ join());
        System.out.println("Joining Delimeter nmethod : "+ join_delimeter());
        System.out.println("Joining prefix and suffix method : "+ join_Pre_suffix());
    }
}
