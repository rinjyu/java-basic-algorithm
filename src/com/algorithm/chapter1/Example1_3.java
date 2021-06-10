package com.algorithm.chapter1;

public class Example1_3 {

    public static void main(String[] args) {

        int maximum = maxValue(20, 31, 15, 31, 7);

        System.out.println("The maximum value is " + maximum);
    }

    public static int maxValue(int data1, int data2, int data3, int data4, int data5) {

        int maximum = data1;
        if (data2 > maximum) {
            maximum = data2;
        }

        if (data3 > maximum) {
            maximum = data3;
        }

        if (data4 > maximum) {
            maximum = data4;
        }

        if (data5 > maximum) {
            maximum = data5;
        }

        return maximum;
    }
}
