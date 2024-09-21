package com.oop.person;

public class Person {
    //Bài 1: Tạo lớp Person với 2 thuộc tính: Name, Age, Address.
    // Viết chương trình khởi tạo một đối tượng và nhập thông tin của đối tượng từ bàn phím và in ra thông tin vừa nhập

    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /*public void doiTuong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập thông tin Name: ");
        name = sc.nextLine();
        //Dòng 1 : Thanh1232
        //Dòng2 : 345234

        //Dòng3:
        //Dòng4:thanh342


        System.out.print("Mời bạn nhập Age: ");
        age = sc.nextInt();

        sc.nextLine();

        System.out.print("Mời bạn nhập Address: ");
        address = sc.nextLine();

        System.out.println("--------------------------------");

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: " + address);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
