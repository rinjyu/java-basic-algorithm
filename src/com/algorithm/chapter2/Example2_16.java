package com.algorithm.chapter2;

public class Example2_16 {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 2};
        int[] array2 = {2, 3, 1};

        if (duplicateCheck(array1, array2)) {
            System.out.println("array1과 array2는 같은 배열이다.");
        } else {
            System.out.println("array1과 array2는 다른 배열이다.");
        }

    }

    public static boolean duplicateCheck(int[] array1, int[] array2) {

        boolean isDuplicate = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }

        return isDuplicate;
    }
}
