package com.algorithm.chapter12;

import java.util.Arrays;
import java.util.Random;

public class Example12_2 {

    public static void main(String[] args) {

        int[] array = new int[]{
                60,59,58,57,56,55,54,53,52,51,
                50,49,48,47,46,45,44,43,42,41,
                40,39,38,37,36,35,34,33,32,31,
                30,29,28,27,26,25,24,23,22,21,
                20,19,18,17,16,15,14,13,12,11,
                10,9,8,7,6,5,4,3,2,1
        };

        quick(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void sortByPivot(int[] array) {
        int middle = array.length / 2;

        for (int i = 0; i < array.length; i += middle) {
            for (int j = i; j < array.length; j += middle) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int getPivotByRandom(int[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];

            int j;
            for (j = i - 1; j >= 0 && array[j] > target; j--) {
                array[j + 1] = array[j];
            }

            array[j + 1] = target;
        }
    }

    private static void quick(int[] array, int start, int end) {
        if (array.length <= 50) {
            insertionSort(array);
            return;
        }

        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        int pivot = getPivotByRandom(array);

        while (left < right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left >= right) {
                break;
            }

            if (array[left] == pivot && array[right] == pivot) {
                left++;
                continue;
            }

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        quick(array, start, left - 1);
        quick(array, left + 1, end);
    }
}
