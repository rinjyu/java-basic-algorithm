package com.algorithm.chapter2;

import java.util.Random;

public class Example2_6 {

    public static void main(String[] args) {

        Random random = new Random();
        final int ARRAY_LENGTH = 100;

        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = random.nextInt(100);
        }

        int minimum = 0;
        int maximum = 0;

        for (int n: array) {
            if (minimum > n) {
                minimum = n;
            } else if(maximum < n) {
                maximum = n;
            }
        }

        System.out.println("최소값={}" + minimum);
        System.out.println("최대값={}" + maximum);
    }
}
