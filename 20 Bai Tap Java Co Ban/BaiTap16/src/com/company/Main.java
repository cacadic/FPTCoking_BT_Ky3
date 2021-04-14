package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String chuoi, kq;
        char kyTu;
        System.out.print("Nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();
        System.out.print("Nhập vào một ký tự: ");
        kyTu = scanner.next().charAt(0);

        kq = chuoi.contains(String.valueOf(kyTu)) ? "Có" : "Không";

        System.out.println(kq);
    }
}
