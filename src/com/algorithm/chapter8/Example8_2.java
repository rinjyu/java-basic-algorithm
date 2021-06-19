package com.algorithm.chapter8;

import java.util.Arrays;

public class Example8_2 {

    public static void main(String[] args) {

        String text = "HelloWorld";
        String[] array = text.split("");

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex].hashCode() < array[j].hashCode()) {
                    continue;
                }

                minIndex = j;
            }

            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("결과={}" + Arrays.toString(array));
    }
}
