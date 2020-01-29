package com.java8.functionalInterface;
import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicate {

    Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    Predicate<Student> p2 = student -> student.getGpa()>=3.9;
    BiPredicate<Integer,Double> bp = (i,d) -> i>=3 && d>=3.9;

    BiConsumer<String, List<String>> bc = (name, act) -> System.out.println("Name :"+ name + "Act :"+act );
    Consumer<Student> con = student -> {
        if(bp.test(student.getGradeLevel(),student.getGpa())){
            bc.accept(student.getName(),student.getActivities());
        }
    };
    public void printNameAndAct(List<Student> ls){
        ls.forEach(con);

    }

    public static void main(String[] args) {
        List<Student> ls = StudentDataBase.getAllStudents();
        new ConsumerAndPredicate().printNameAndAct(ls);
    }
}
