package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    public static void filterStudentByGrade(){
        List<Student> l = StudentDataBase.getAllStudents();
       l.forEach(student -> {
           if(p1.test(student)){
               System.out.println(student);
           }
       });

    }
    public static void filterStudentByGpa(){
        List<Student> l = StudentDataBase.getAllStudents();
        l.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });

    }

    public static void filterStudent(){
        List<Student> l = StudentDataBase.getAllStudents();
        l.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        List<Student> l = StudentDataBase.getAllStudents();
        l.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
filterStudents();
    }
}
