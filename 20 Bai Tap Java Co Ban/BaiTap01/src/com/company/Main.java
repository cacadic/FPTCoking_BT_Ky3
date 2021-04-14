package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Xin mời 1 số nguyên bất kỳ: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String kq = "";

        if (a >= 0) {
            kq = "Đây là số nguyên dương";
        } else {
            kq = "Đây là số nguyên âm";
        }

        System.out.println(kq);
    }
}
