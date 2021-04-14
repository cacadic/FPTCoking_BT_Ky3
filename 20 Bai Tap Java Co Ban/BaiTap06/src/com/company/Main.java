package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập số nguyên dương n: ");
        n = scanner.nextInt();

        if (n >= 0) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }

            System.out.println("Tổng tất cả các số chẵn từ 0 - n: " + sum);
        } else {
            System.out.println("Bạn nhập sai số nguyên dương rồi!");
        }
    }
}
