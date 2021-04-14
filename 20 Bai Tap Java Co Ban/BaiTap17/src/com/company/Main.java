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

        int viTri = chuoi.indexOf(String.valueOf(kyTu));
        kq = viTri > 0 ? "Vị trí ký tự trong chuỗi: " + viTri : "Không tồn tại trong chuỗi";
        System.out.println(kq);
    }
}
