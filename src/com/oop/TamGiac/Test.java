package com.oop.TamGiac;

public class Test {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac(3,4,6);

        tamGiac.setA(7);
        tamGiac.getA();

        tamGiac.setB(9);
        tamGiac.getB();

        tamGiac.setC(10);
        tamGiac.getC();


        tamGiac.kiemTra();
        tamGiac.chuVi();
        tamGiac.dienTich();
    }
}
