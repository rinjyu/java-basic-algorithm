package com.algorithm.chapter12;

public class QuickSort {

    public void quick(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        int pivot = array[(left + right) / 2];
        System.out.println(String.format("pivot값={}%s", pivot));

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

            quick(array, start, left - 1);
            quick(array, left + 1, end);
        }
    }
}
