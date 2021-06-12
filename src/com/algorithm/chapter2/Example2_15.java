package com.algorithm.chapter2;

public class Example2_15 {

    public static void main(String[] args) {

        int[] array = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

        int minimum = 0;
        int maximum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                minimum = array[i];
                maximum = array[i];
            }

            if (minimum > array[i]){
                minimum = array[i];
            }

            if (maximum < array[i]){
                maximum = array[i];
            }
        }

        System.out.println("최소값={}" + minimum);
        System.out.println("최대값={}" + maximum);
    }
}
