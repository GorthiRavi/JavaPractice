package com.java8.streams;

import com.pojo.StudentDataBase;

public class MatchEx {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(s -> s.getGpa()>=3.5);
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(s -> s.getGpa()>=4.0);
    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(s -> s.getGpa()>=4.0);
    }
    public static void main(String[] args) {
        System.out.println("All student match GPA greter or equals 3.5 : "+ allMatch() );
        System.out.println("Any student match GPA greter or equals 4.0 : "+ anyMatch() );
        System.out.println("None student match GPA greter or equals 4.0 : "+ anyMatch() );
    }
}
