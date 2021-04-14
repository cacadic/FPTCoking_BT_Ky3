package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String pattern = "B170[1-9]{4}";

        for (int i = 1; i <= 5; i++) {
            String a, kq;
            System.out.print("Nhập mã số sinh viên thứ " + i + ": ");
            a = scanner.nextLine();
            kq = a.matches(pattern) ? "Mã số sinh viên thứ " + i + " đúng với định dạng" : "Mã số sinh viên thứ " + i + " sai với định dạng";
            System.out.println(kq);
        }


    }
}
