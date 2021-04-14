package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int soLanXuatHien = 0;
        String chuoi;
        System.out.print("Nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) == 'a'){
                soLanXuatHien++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự a: " + soLanXuatHien);
    }
}
