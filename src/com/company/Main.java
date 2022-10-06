package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculateMaxValue();
    }

    private static void calculateMaxValue() {
        Scanner scan = new Scanner(System.in);

        double x;
        do {
            System.out.println("Введіть значення Х:");
            x = scan.nextDouble();
        } while (x < 0);

        double y;
        do {
            System.out.println("Введіть значення Y:");
            y = scan.nextDouble();
        } while (y < 0);

        double res;
        if (x > y) {
            res = x;
        } else {
            if (x == y) {
                res = x;
            } else {
                res = y;
            }
        }

        System.out.println("Найбільше число=" + res);
    }
}
