package com.algorithm.chapter1;

public class Example1_1 {

    public static void main(String[] args) {

        int[] arrays = {3, 1, 9, 5, 10};
        int minimum = minValue(arrays);

        System.out.println("The minimum value is " + minimum);
    }

    public static int minValue(int[] arrays) {

        int minimum = 0;
        for (int i = 0; i < arrays.length; i ++) {
            int tempNumber = arrays[i];
            if (i == 0) {
                minimum = arrays[i];
            }

            if (tempNumber < minimum) {
                minimum = tempNumber;
            }
        }

        return minimum;
    }
}
