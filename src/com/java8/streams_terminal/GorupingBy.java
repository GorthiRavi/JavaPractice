package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class GorupingBy {


    public static void groupBy(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println("Groung By :" + map);
    }


    public static void cus_groupBy(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(s -> s.getGpa() > 3.9 ? "OUTSATNDING" : "AVERAGE"));
        System.out.println("Cus Groung By :" + map);
    }


    // two param groupingByex
    public static void groupBy_2param(){
        Map<String, Map<String,List<Student>>> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, groupingBy(s -> s.getGpa() > 3.9 ? "OUTSATNDING" : "AVERAGE")));
        System.out.println(" Groung By two params : " + map);
    }

    // two param groupingBy and summimg int ex
    public static void groupBy_sumint(){
        Map<String, Integer> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(" Groung By summing int : " + map);
    }

    // three param groupingBy
    public static void groupBy_3param(){
        Map<String, Set<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(" Groung By Three Param : " + map);
    }


    public static void groupBy_maxBy(){
        Map<Integer, Optional<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(" Groung By MaxBy  : " + map);
    }

    public static void groupBy_maxBy1(){
        Map<Integer, Student> map = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(" Groung By MaxBy without Optiponal  : " + map);
    }

    public static void main(String[] args) {
        groupBy();;
        cus_groupBy();
        groupBy_2param();
        groupBy_sumint();
        groupBy_3param();
        groupBy_maxBy();
    }
}
