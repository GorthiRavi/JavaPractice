package com.java8.methodReference;

import com.pojo.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefEx {

static Supplier<Student> sup = Student::new;
static Function<String,Student> fun = Student::new;

     //below code gives compilation error, bcz method ref and const ref only for functional intrf implemetation
    // Student s = Student::new

    public static void main(String[] args) {
        System.out.println(sup.get());
        System.out.println(fun.apply("abc"));
    }
}
