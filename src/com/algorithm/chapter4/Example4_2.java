package com.algorithm.chapter4;

public class Example4_2 {

    public static void main(String[] args) {

        System.out.println("5!={}" + factorial(5));
        System.out.println("6!={}" + factorial(6));
        System.out.println("7!={}" + factorial(7));
    }

    public static int factorial(int number) {

        if (number <= 1) {
            return 1;
        }

        return number * factorial(--number);
    }
}
