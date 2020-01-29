package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

    Supplier<List<Student>> s = () -> StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(new SupplierEx().s.get());
    }
}
