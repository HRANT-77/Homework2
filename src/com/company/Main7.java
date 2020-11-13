package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the month ");
        String month = scanner.nextLine();
        switch (month) {
            case ("February"):
                System.out.println(month + " has 28 days");
                break;
            case ("January"):
            case ("March"):
            case ("May"):
            case ("July"):
            case ("August"):
            case ("October"):
            case ("Dectember"):
                System.out.println(month + " has 31 days");
                break;
            case ("April"):
            case ("June"):
            case ("September"):
            case ("November"):
                System.out.println(month + " has 30 days");
                break;
        }
    }
}
