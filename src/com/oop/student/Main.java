package com.oop.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        int nhap = student.nhapSoN();
        student.studentInfo(nhap);
    }
}
