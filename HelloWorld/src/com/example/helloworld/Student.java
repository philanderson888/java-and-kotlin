package com.example.helloworld;

public class Student {
    private  String firstName;
    private  String lastName;
    public  String studentNumber;
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }
    public Student(String first,String last, String student){
        firstName=first;
        lastName=last;
        studentNumber=student;
    }
}