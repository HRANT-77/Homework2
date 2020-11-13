package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number ");
        int numb = scanner.nextInt();
        switch (numb) {
            case (1):
                System.out.println(numb + " - Sunday");
                break;
            case (2):
                System.out.println(numb + " - Monday");
                break;
            case (3):
                System.out.println(numb + " - Tuesday");
                break;
            case (4):
                System.out.println(numb + " - Wednesday");
                break;
            case (5):
                System.out.println(numb + " - Thursday");
                break;
            case (6):
                System.out.println(numb + " - Friday");
                break;
            case (7):
                System.out.println(numb + " - Saturday");
                break;
        }
    }
}
