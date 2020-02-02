package com.java8.streams_terminal;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class PartioningByEx {

    public static void partionBy(){
        Predicate<Student> predicate = s -> s.getGpa()>3.9;
        Map<Boolean, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate));
        System.out.println("Partitioning By : "+map);
    }

    public static void partionBy_2(){
        Predicate<Student> predicate = s -> s.getGpa()>3.9;
        Map<Boolean, Set<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate,toSet()));
        System.out.println("Partitioning By to Set : "+map);
    }
    public static void main(String[] args) {
partionBy();
partionBy_2();
    }
}
