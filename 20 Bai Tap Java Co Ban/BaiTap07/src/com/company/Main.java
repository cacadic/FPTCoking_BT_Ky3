package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        long n;
        System.out.print("Nhập số nguyên n: ");
        n = scanner.nextLong();

        long sum = n;
        for (long i = 1; i <= 20; i++) {
            sum *= i;
        }

        System.out.println("Phép nhân " + n + " với các số từ 1 - 20 có kết quả là: " + sum);
    }
}
