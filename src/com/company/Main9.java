package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  the first number: ");
        int a = scanner.nextInt();
        System.out.println("Input the second number: ");
        int b = scanner.nextInt();
        if (a >= 25 && b >= 25 && a <= 75 && b <= 75) {
            System.out.println(a % 10 == b % 10 || a / 10 == b / 10 || a % 10 == b / 10 || a / 10 == b % 10);
        } else {
            System.out.println("The numbers entered do not belong to the range of [25,75]");
        }
    }
}