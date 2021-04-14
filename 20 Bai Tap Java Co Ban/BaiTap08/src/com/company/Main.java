package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập số nguyên dương n < 1000: ");
        n = scanner.nextInt();

        System.out.println("Các số nguyên tố trong khoảng 0 - " + n + ":");
        if (n > 2) {
            for (int i = 0; i <= n; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
