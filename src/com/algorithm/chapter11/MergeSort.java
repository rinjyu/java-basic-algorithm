package com.algorithm.chapter11;

public class MergeSort {

    public void mergeSort(int[] array, int start, int end, int division) {
        int[] temp = new int[array.length];

        int s = start;
        int r = division + 1;
        int k = start;

        while (s <= division && r <= end) {
            if (array[s] <= array[r]) {
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

        for (int h = 0; h <= end - start; h++) {
            array[start + h] = temp[start + h];
        }
    }

    public void merge(int[] array, int left, int right) {
        if (left < right) {
            int division = (left + right) / 2;

            merge(array, left, division);
            merge(array, division + 1, right);
            mergeSort(array, left, right, division);
        }
    }
}
