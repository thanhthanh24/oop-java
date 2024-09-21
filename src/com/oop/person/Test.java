package com.oop.person;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Bài 1: Tạo lớp Person với 2 thuộc tính: Name, Age, Address.
        // Viết chương trình khởi tạo một đối tượng và nhập thông tin của đối tượng từ bàn phím và in ra thông tin vừa nhập
        Person person = new Person();
       // person.doiTuong();

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập thông tin Name: ");
        person.setName(sc.nextLine());

        //Dòng 1 : Thanh1232
        //Dòng2 : 345234

        //Dòng3:
        //Dòng4:thanh342

        System.out.print("Mời bạn nhập Age: ");
        person.setAge(sc.nextInt());

        sc.nextLine();

        System.out.print("Mời bạn nhập Address: ");
        person.setAddress(sc.nextLine());

        System.out.println("--------------------------------");

        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
