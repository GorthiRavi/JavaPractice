package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalIntrfEx {

Function<List<Student>, Map<String,Double>> fun = (students -> {
    HashMap<String,Double> hm = new HashMap<>();
    students.forEach(student -> {
        if (new ConsumerAndPredicate().p1.test(student)) {
            hm.put(student.getName(),student.getGpa());
        }

    });
    return hm;
});
    public static void main(String[] args) {
        List<Student> ls = StudentDataBase.getAllStudents();
        System.out.println(new FunctionalIntrfEx().fun.apply(ls));
    }
}
