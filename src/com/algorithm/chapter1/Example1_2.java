package com.algorithm.chapter1;

public class Example1_2 {

    public static void main(String[] args) {

        int minimum = minValue(5, 9, 2, 13);

        System.out.println("The minimum value is " + minimum);
    }

    public static int minValue(int data1, int data2, int data3, int data4) {

        int minimum = data1;
        if (data2 < minimum) {
            minimum = data2;
        }

        if (data3 < minimum) {
            minimum = data3;
        }

        if (data4 < minimum) {
            minimum = data4;
        }

        return minimum;
    }

}
