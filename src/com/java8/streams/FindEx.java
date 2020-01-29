package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Optional;

public class FindEx {


    public static Optional<Student> findAny(){
       return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa()>= 3.5)
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .findAny();
    }
    public static void main(String[] args) {

        System.out.println("Find any student >= 3.5 gpa : "+ findAny().get() );
        System.out.println("Find first student  : "+ findFirst().get() );
    }
}
