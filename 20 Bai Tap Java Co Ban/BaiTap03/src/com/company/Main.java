package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhập số thực a: ");
        a = scanner.nextFloat();
        System.out.print("Nhập số thực b: ");
        b = scanner.nextFloat();
        System.out.print("Nhập số thực c: ");
        c = scanner.nextFloat();

        boolean isTamGiac = true;

        if ((a + b) <= c) isTamGiac = false;
        if ((a + c) <= b) isTamGiac = false;
        if ((b + c) <= a) isTamGiac = false;

        String kq = isTamGiac ? "Đây đúng là 3 cạnh của 1 tam giác" : "Đây không phải 3 cạnh của 1 tam giác";

        System.out.println(kq);

    }
}
