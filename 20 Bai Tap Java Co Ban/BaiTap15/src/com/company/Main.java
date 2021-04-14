package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String pattern = "00yL[1-9]{4}";
        String[] mang = new String[5];
        for (int i = 0; i < 5; i++) {
            String a;
            System.out.print("Nhập mã số sinh viên thứ " + (i + 1) + ": ");
            a = scanner.nextLine();
            if (!a.matches(pattern)) {
                System.out.println("Sai rồi");
                break;
            } else {
                System.out.println("Đúng rồi!");
                mang[i] = a;
            }
        }
    }
}
