package com.oop.student;

import java.util.*;

public class Student {
    /*
     * Bài 3: Tạo lớp SinhVien với 3 thuộc tính: Ten, Tuoi, MSV.
     * Viết chương trình nhập từ bàn phím một số nguyên N, sau đó cho phép nhập thông tin của N sinh viên,
     * viết các hàm check thông tin Tuổi >= 18, MSV không được trùng với sinh viên trước đã nhập.
     * Nếu nhập sai thông tin cho phép người dùng nhập lại đến khi đúng.
     * Cuối cùng in ra màn hình danh sách sinh viên vừa nhập*/

    // Tạo lớp với các thuộc tính
    private String name;
    private int age;
    private int username;

    public Student() {
    }

    public Student(String name, int age, int username) {
        this.name = name;
        this.age = age;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getUsername() {
        return username;
    }

    public static int nhapSoN() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập số lượng sinh viên: ");
            return sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Không đúng định dạng số, xin mời nhập lại!");
            return nhapSoN();
        }
    }

    public static void studentInfo(int count) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        Set<Integer> usernames = new HashSet<>();

        // Nhập thông tin sinh viên và add sinh viên vào 1 list
        for (int i = 0; i < count; i++) {
            System.out.printf("Mời bạn nhập thông tin sinh viên thứ %s.%n", i + 1);
            System.out.println("Mời nhập tên: ");
            String name = sc.nextLine();

            // Nhập và kiểm tra tuổi
            int age = validateAge();

            // Nhập và kiểm tra mã sinh viên
            int username = validateUsername();

            // Tạo 1 Set danh sách MSV, phục vụ kiểm tra nếu nhập dữ liệu trùng lặp
            username = checkDuplicateUsername(usernames, username);

            students.add(new Student(name, age, username));
        }

        // Kiểm tra thông tin tuổi >= 18
        ageChecking(students);
    }

    private static int validateAge() {
        int tuoi;
        System.out.println("Mời bạn nhập tuổi (dạng số): ");
        try {
            Scanner sc = new Scanner(System.in);
            tuoi = sc.nextInt();
            sc.nextLine();
            return tuoi;
        } catch (Exception ex) {
            System.out.println("Tuổi phải là số, vui lòng nhập lại!");
            return validateAge();
        }
    }

    private static int validateUsername() {
        int msv;
        System.out.println("Mời bạn nhập mã sinh viên (dạng số): ");
        try {
            Scanner sc = new Scanner(System.in);
            msv = sc.nextInt();
            sc.nextLine();
        } catch (Exception ex) {
            System.out.println("Mã sinh viên phải là số, vui lòng nhập lại!");
            return validateUsername();
        }
        return msv;
    }

    private static int checkDuplicateUsername(Set<Integer> usernames, int username) {
        Scanner sc = new Scanner(System.in);
        if (!usernames.add(username)) {
            System.out.println("Mã sinh viên đã tồn tại, vui lòng nhập mã khác: ");
            username = sc.nextInt();
            sc.nextLine();
            checkDuplicateUsername(usernames, username);
        }
        return username;
    }

    public static void ageChecking(List<Student> sv) {
        List<Student> enoughAges = new ArrayList<>();
        for (Student student : sv) {
            // gọi phần tử sv tại vị trí i trong danh sách Student
            if (student.getAge() >= 18) {
                enoughAges.add(student);
            }
        }

        if (enoughAges.isEmpty()) {
            System.out.println("Không có ai đủ 18 tuổi.");
            return;
        }

        System.out.println("Danh sách sinh viên >= 18 tuổi là: ");
        for (Student s : enoughAges) {
            System.out.printf("%s, MSV - %s: %s tuổi%n", s.getName(), s.getUsername(), s.getAge());
        }

    }
}
