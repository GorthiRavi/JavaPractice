package com.java8.methodReference;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class MethodRefConsumerFunInterf {
    // with lambda
     Consumer<Student> con = s -> System.out.println(s);
     // with method reference ( ClassName::method)
     static Consumer<Student> con1 = System.out::println;
    // with method reference ( ClassName::method)
    static Consumer<Student> con2 = Student::printListOfActivities;
    public static void main(String[] args) {

        List<Student> list = StudentDataBase.getAllStudents();
        list.forEach(con1);
        list.forEach(con2);

    }
}
