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
            int[] mangNguoc = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
                mang[i] = scanner.nextInt();
                mangNguoc[n - i - 1] = mang[i];
            }

            System.out.println("Sắp xếp các phần tử trong mảng theo thứ tự ngược lại: ");
            for (int i : mangNguoc) {
                System.out.print(i + " ");
            }
        }

    }
}
