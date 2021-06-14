package com.algorithm.chapter4;

import java.util.Scanner;

public class Example4_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력값={}");

        int number = scanner.nextInt();

        System.out.println("피보나치 수열={}");

        for (int i = 0; i < number; i++) {
            System.out.printf(fibonacci(i) + "");
        }
    }

    public static int fibonacci(int number) {

        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
