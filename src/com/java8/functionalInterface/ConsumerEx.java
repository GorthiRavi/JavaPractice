package com.java8.functionalInterface;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
  static Consumer<Student> cons = stu -> System.out.println(stu.getName().toString());
    static Consumer<Student> cons1 = stu -> System.out.println(stu.getActivities().toString());
  public static void printName(){
     //Consumer<Student> cons = stu -> System.out.println(stu.getName().toString());
      List<Student> ls = StudentDataBase.getAllStudents();
      ls.forEach(cons);
  }

  //Consumer chaining (andThen)
  public static void printNameAndActivities(){
      /* Removing duplicate code
      * Consumer<Student> cons = stu -> System.out.println(stu.getName().toString());
      Consumer<Student> cons1 = stu -> System.out.println(stu.getActivities().toString());*/
      List<Student> ls = StudentDataBase.getAllStudents();
      ls.forEach(cons.andThen(cons1));
  }

    public static void printNameAndActivitiesCondition(){
        System.out.println("Pring Gradle3 level ");
                List<Student> ls = StudentDataBase.getAllStudents();
              /* using this or bwloe are same result
              ls.stream().filter(student -> student.getGradeLevel()>3).forEach(cons.andThen(cons1));*/
        ls.forEach(student -> {
                if(student.getGradeLevel()>3){
                    cons.andThen(cons1).accept(student);
                }
        });
    }

    public static void main(String[] args) {

        Consumer<String> con = s -> System.out.println(s.toUpperCase());
        con.accept("Java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesCondition();
    }
}
