package com.algorithm.chapter2;

public class Example2_13 {

    public static void main(String[] args) {

        int[][] array = new int[8][9];

        for (int i = 0, k = 2; i < array.length; i++, k++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = k * (j + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 9; j++) {
                if (j != 0 && j % 3 == 0) {
                    System.out.println("");
                }

                System.out.println((i + 2) + "X" + (j + 1) + "=" + array[i][j]);
                System.out.println(" ");
            }

            System.out.println("\n");
        }
    }
}
