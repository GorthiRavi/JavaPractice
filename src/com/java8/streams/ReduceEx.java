package com.java8.streams;

import com.pojo.Student;
import com.pojo.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx {

public static int mult(List<Integer> lis){

    return lis.stream()
            // below 1 is default value and binary operator
            // 1 -> 1*1
            // 2 -> 1*2 (result of above operation * new iterate value
            // 3 -> 2*3
            // 4 -> 6 *4
            // 5 -> 24 * 5
            .reduce(1, (a,b) -> a*b);
}
    public static Optional<Integer> withoutDefValuemult(List<Integer> lis){

        return lis.stream()
// Returing optional integer
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGradeStudent(){

        return StudentDataBase.getAllStudents().stream()
                // get student one by one
                .reduce((s1,s2) -> (s1.getGradeLevel()>s2.getGradeLevel() ? s1 : s2));
    }
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,2,3,4,5);
        System.out.println(mult(lis));
        System.out.println("Without default value : "+mult(lis));
        System.out.println("Highest Grade Student : "+ getHighestGradeStudent());
    }
}
