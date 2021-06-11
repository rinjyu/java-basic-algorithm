package com.algorithm.chapter2;

import java.util.Random;

public class Example2_7 {

    public static void main(String[] args) {

        Random random = new Random();
        final int ARRAY_LENGTH = 10;

        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            boolean isPrimeNumber = true;
            int randomNumber = random.nextInt(ARRAY_LENGTH);

            if (randomNumber == 1) {
                continue;
            }

            if (randomNumber == 2) {
                continue;
            }

            for (int j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                array[i] = randomNumber;
            }

            System.out.println("배열에 저장된 소수");
            for (int k: array) {
                if (k > 0) {
                    System.out.println(k);
                }
            }
        }

    }
}
