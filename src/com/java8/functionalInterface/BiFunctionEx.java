package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionEx {

    BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> fun = ((students,p1) -> {
        HashMap<String,Double> hm = new HashMap<>();
        students.forEach(student -> {
            if (p1.test(student)) {
                hm.put(student.getName(),student.getGpa());
            }

        });
        return hm;
    });
    public static void main(String[] args) {
        List<Student> ls = StudentDataBase.getAllStudents();
        System.out.println(new BiFunctionEx().fun.apply(ls, new ConsumerAndPredicate().p1));
    }
}


