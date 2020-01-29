package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSortEx {

    public static List<String> getDistinctAllActivities(){
    List<String> lis = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());
    return lis;
}

    public static List<String> getsortedAllActivities(){
        List<String> lis = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return lis;
    }

    public static long getCountAllActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();

    }
    public static void main(String[] args) {
        System.out.println("Activites : " + getDistinctAllActivities());
        System.out.println("Count : " + getCountAllActivities());
        System.out.println("Count : " + getsortedAllActivities());
    }
}
