package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String a;
        System.out.print("Nhập mã số sinh viên: ");
        a = scanner.nextLine();

        String pattern = "B[1-9]{7}";

        String kq = a.matches(pattern) ? "Mã số đã nhập đúng với định dạng" : "Mã số đã nhập sai với định dạng";
        System.out.println(kq);
    }
}
