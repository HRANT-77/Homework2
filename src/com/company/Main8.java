package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int num;
        int radius = 5;
        double pi = Math.PI;
        double perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------MENU-----------");
            System.out.println("-- enter 1 for calculating area of the circle");
            System.out.println("-- enter 2 for calculating perimeter of the circle");
            System.out.println("-- enter 3 for exit.");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Area is " + area);
            } else if (num == 2) {
                System.out.println("Perimeter is " + perimeter);
            } else {
                System.out.println("Input a valid number");
            }
        } while (num != 3);
    }
}
