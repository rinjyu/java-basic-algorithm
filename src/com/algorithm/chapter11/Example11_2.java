package com.algorithm.chapter11;

import java.util.Arrays;

public class Example11_2 {

    public static void main(String[] args) {

        int[] array = {1, 12, 15, 7, 3, 9, 10, 8, 2, 5, 4};
        merge(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int start, int end, int division) {
        int[] temp = new int[array.length];

        int s = start;
        int r = division + 1;
        int k = start;

        int[] targetArray1 = new int[array.length];
        for (int i = 0, a = s; a < division; a++) {
            targetArray1[i] = array[a];
        }

        int[] targetArray2 = new int[array.length];
        for (int j = 0, b = r; b <= end; b++) {
            targetArray2[j] = array[b];
        }

        System.out.println(String.format("[병합과정] %s, %s", Arrays.toString(targetArray1), Arrays.toString(targetArray2)));

        while (s <= division && r <= end) {
            if (array[s] >= array[r]) {
                temp[k++] = array[s++];
            } else {
                temp[k++] = array[r++];
            }
        }

        while (s <= division) {
            temp[k++] = array[s++];
        }

        while (r <= end) {
            temp[k++] = array[r++];
        }
        System.out.println(String.format("[병합결과] %s",Arrays.toString(temp)));
        System.out.println("===================================================");

        for (int h = 0; h <= end - start; h++) {
            array[start + h] = temp[start + h];
        }
    }

    private static void merge(int[] array, int left, int right) {
        if (left < right) {
            int division = (left + right) / 2;

            System.out.print("[분할과정] ");
            for (int i = left; i < division; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
            merge(array, left, division);

            System.out.print("[분할과정] ");
            for (int i = division + 1; i <= right; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
            merge(array, division + 1, right);

            mergeSort(array, left, right, division);
        }
    }
}
