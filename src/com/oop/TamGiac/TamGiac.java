package com.oop.TamGiac;

/**
 * Tạo lớp TamGiac, trong đó có các thuộc tính là 3 cạnh của một tam giác. Viết các method tính chu vi và diện tích.
 * Khởi tạo 2 đối tượng tam giác ở hàm main, set giá trị cho các đối tượng và in ra chu vi và diện tích của 2 tam giác đó
 * [Tập tin: Main.java]
 * [Tập tin: SinhVien.java]
 */
public class TamGiac {
    private int a;
    private int b;
    private int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getA() {
        System.out.println("Cạnh thứ 1 của hình tam giác có giá trị là : " + a);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void getB() {
        System.out.println("Cạnh thứ 2 của hình tam giác có giá trị là : " + b);

    }

    public void setB(int b) {
        this.b = b;
    }

    public void getC() {
        System.out.println("Cạnh thứ 3 của hình tam giác có giá trị là : " + c);
    }

    public void setC(int c) {
        this.c = c;
    }
    public void kiemTra(){
        if (a+b>c || a+c>b ||b+c>a){
            System.out.println("3 cạnh bạn vừa nhập thỏa mãn là 1 hình tam giác rồi nhá ");
        }else
            System.out.println("3 cạnh bạn vừa nhập không phải là hình tam giác rồi bạn ơi ");
    }

    public  void  chuVi(){
        int chuVi = a + b + c;
        System.out.println("Chu vi của hình tam giác là : " + chuVi);
    }

    public void dienTich(){
        double p = (a + b + c) / 2.0;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích của hình tam giác là : " + S);
    }
}
