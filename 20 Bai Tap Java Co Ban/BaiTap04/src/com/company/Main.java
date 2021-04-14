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

        boolean isTamGiacVuong = false;
        if (a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b)) isTamGiacVuong = true;

        String kq = isTamGiacVuong ? "Đây đúng là 3 cạnh của 1 tam giác vuông" : "Đây không phải 3 cạnh của 1 tam giác vuông";
        System.out.println(kq);
    }
}
