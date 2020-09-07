package com.example.helloworld;
import java.util.function.Function;

public class FunctionalProgramming {

    protected static Function<Student,Boolean> f = s -> {
        System.out.println(s.getFullName());
        System.out.println(s.studentNumber);
        var fullname = s.getFullName();
        if("John Smith".equals(s.getFullName()) && s.studentNumber=="js123"){
            return true;
        }
        else return false;
    };
}
