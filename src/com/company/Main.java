package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        int s = number1 + number2;
        long sum = s;
        System.out.println(sum);
    }
}
