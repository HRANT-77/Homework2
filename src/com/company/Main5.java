package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();
        int r1 = random.nextInt(50);
        int r2 = random.nextInt(50);
        System.out.println(r1);
        System.out.println(r2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input mark ");
        String mark = scanner.nextLine();
        switch (mark) {
            case ("+"):
                System.out.println(r1 + r2);
                break;
            case ("-"):
                System.out.println(r1 - r2);
                break;
            case ("*"):
                System.out.println(r1 * r2);
                break;
            case ("/"):
                System.out.println(r1 / r2);
                break;
        }
    }
}