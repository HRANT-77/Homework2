package com.company;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(90) + 10;
        double result = Math.pow(num, 2);
        String s = String.valueOf(result);
        System.out.println(s);
    }
}
