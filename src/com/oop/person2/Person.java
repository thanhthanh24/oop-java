package com.oop.person2;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Person {
    /*
 Bài 1: Tạo lớp Person với 2 thuộc tính: Name, Age, Address. Viết chương trình nhập từ bàn phím một số nguyên N, sau đó cho phép nhập thông tin của N người
a. Viết hàm phân loại dựa độ tuổi: nếu > 18 thì in ra người lớn ngược lại là trẻ con
b. In ra toàn bộ thông tin số người  đã nhập cùng thông tin phân loại dựa theo độ tuổi
c. Giả sử chỉ có người lớn mới được đi chơi trung thu. Vì vậy hãy loại bỏ toàn bộ trẻ con trong danh sách đã nhập và in ra màn hình danh sách mới*/


    /*Bước 1 : Khai báo thuộc tính của lớp
     * Bước 2 : Nhập số n
     * Bước 3: Nhập thông tin của n người lần lượt theo thuộc tính ở bước 1:
     * - Muốn làm đc thì phải chuyển về dạng list*/

    //Bước 1 : Khai báo thuộc tính của lớp
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;      // Gán giá trị cho name
        this.age = age;        // Gán giá trị cho age
        this.address = address; // Gán giá trị cho address
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //Bước 2 : Nhập số n
    public static int input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập số n: ");
            return sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Bạn nhập không đúng định dạng số, xin mời nhập lại!");
            return input();
        }
    }


    //Bước 3 : Nhập thông tin của n người

    public static void personalInfo(int n) {

        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập thông tin người thứ " + (i + 1));
            System.out.print("Mời bạn nhập Name: ");
            String name = sc.nextLine();
            System.out.print("Mời bạn nhập Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Mời bạn nhập Address: ");
            String address = sc.nextLine();

            //thêm thông tin Person vào list people
            people.add(new Person(name, age, address));
        }
        phanLoai(people);
        print(people);
        diTrungThu(people);

    }

    public static void phanLoai(List<Person> people) {


        // Phân loại độ tuổi
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getAge() >= 18) {
                System.out.println("Người thứ " + (i + 1) + " là người lớn");
            } else {
                System.out.println("Người thứ " + (i + 1) + " là trẻ con ");
            }

        }
        System.out.println(" --------------------------- ");
    }

    // List chứa các đổi tượng của Person và nó có tên là people
    //2.In ra thông tin danh sách đã nhập
    public static void print(List<Person> people) {
        System.out.println("Thông tin Person đã nhập là : ");
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            System.out.println("Person thứ  " + (i + 1) + " là :");
            System.out.print("Name :" + person.getName());
            System.out.print("\nAge :" + person.getAge());
            System.out.println("\nAddress :" + person.getAddress());
            System.out.println("");
        }
        System.out.println("-----------------------------");

    }

    public static void diTrungThu(List<Person> people){

        List<Person> nguoiLon = new ArrayList<>();
        System.out.println("Thông tin những người được đi trung thu bao gồm: ");
        System.out.println("");
        for (int i = 0 ; i< people.size(); i++){
            Person person = people.get(i);
            if(person.getAge() >= 18){
                //Thêm người lớn vào
                nguoiLon.add(person);
                System.out.println("Person thứ " + (i + 1) + " là: ");
                System.out.print("Name:" + person.getName());
                System.out.print("\nAge:" + person.getAge());
                System.out.println("\nAddress :" + person.getAddress());
                System.out.println("");
            }

        }

    }


}
