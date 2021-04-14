package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String chuoi, kq;
        System.out.print("Nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();

        boolean haveNum = false;

        for (int i = 0; i < chuoi.length(); i++) {
            String cat = chuoi.substring(i, i + 1);
            if (tryParseInt(cat)) haveNum = true;
        }

        kq = haveNum ? "Có" : "Không";

        System.out.println(kq);
    }

    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
