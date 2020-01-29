package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerEx {
    static BiConsumer<String, List<String>> bc = (name,act) -> System.out.println("Name :"+ name + "Act :"+act );
    public static void stuNameActi(){
        List<Student> l = StudentDataBase.getAllStudents();
        l.forEach(s -> bc.accept(s.getName(),s.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> bc = (s1,s2) -> System.out.println(s1+s2);
        bc.accept("java", "c");
        stuNameActi();
    }
}
