package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number ");
        int numb = scanner.nextInt();
        Random random = new Random();
        int r;
        if (numb > 100) {
            r = random.nextInt(70) + 50;
        } else {
             r = random.nextInt(50);
        }
        String s=String.valueOf(r);
        System.out.println(s);
    }
}
