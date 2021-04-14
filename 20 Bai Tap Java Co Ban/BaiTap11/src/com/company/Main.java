package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập n: ");
        n = scanner.nextInt();

        if (n > 0) {
            int[] mang = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
                mang[i] = scanner.nextInt();
                sum += mang[i];
            }

            System.out.println("Giá trị trung bình của mảng là: " + ((float) sum / (float) n));
        }
    }
}
