package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String chuoi, kq;
        boolean duyet = true;
        String dk1 = "^[A-Z].+[^\s][0-9]$";

        System.out.print("Nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();
        if (chuoi.length() > 20) duyet = false;
        if (!chuoi.matches(dk1)) duyet = false;

        kq = duyet ? "Duyệt" : "Không Duyệt";

        System.out.println(kq);
    }
}
