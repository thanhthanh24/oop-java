package com.oop.person2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        int nhap = person.input();
        person.personalInfo(nhap);
    }
}
