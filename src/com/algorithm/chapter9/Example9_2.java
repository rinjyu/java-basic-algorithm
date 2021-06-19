package com.algorithm.chapter9;

import java.util.Arrays;

public class Example9_2 {

    public static void main(String[] args) {

        String text = "llll looo lloo oolo loll oool";
        String[] temp = text.split(" ");
        int[] array = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            String binary = temp[i];

            String[] binaryArr = binary.split("");
            int sum = 0;
            for (int j = binaryArr.length - 1; j >= 0; j--) {
                if ("o".equals(binaryArr[j])) {
                    continue;
                }

                int count = 3 - j;
                int number = 1;
                while ((count--) > 0) {
                    number *= 2;
                }
                sum += number;
            }

            array[i] = sum;
        }

        sort(array);
        System.out.println("결과={}" + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int i = 1;
        while (i < array.length) {
            int target = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > target) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = target;
            i++;
        }
    }
}
