package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập số nguyên dương n: ");
        n = scanner.nextInt();

        if (n > 0) {
            int[] mang = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
                mang[i] = scanner.nextInt();
                if (i == 0) {
                    max = mang[i];
                } else {
                    if (max < mang[i]) {
                        max = mang[i];
                    }
                }
            }

            System.out.println("Phần tử có giá trị lớn nhất của mảng là: " + max);
        } else {
            System.out.println("Bạn nhập sai rồi!");
        }
    }
}
