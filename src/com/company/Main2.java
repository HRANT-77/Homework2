package com.company;

import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        int prod = number1 * number2;
        if (prod % 2 == 0) {
            long product = prod;
            System.out.println(product);
        } else {
            double product = prod;
            System.out.println(product);
        }
    }
}