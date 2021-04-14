package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập n: ");
        n = scanner.nextInt();

        int[] mang = new int[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            mang[i] = scanner.nextInt();
            if (i == 0) {
                min = mang[i];
            } else {
                if (min > mang[i]) {
                    min = mang[i];
                }
            }
        }

        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + min);
    }
}
