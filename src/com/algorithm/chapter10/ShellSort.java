package com.algorithm.chapter10;

import java.util.Arrays;

public class ShellSort {

    public void sort(int[] array) {

        int length = array.length;
        System.out.println(String.format("초기 배열={}%s\n", Arrays.toString(array)));
        System.out.println("=========");
        for (int gap = length / 2; gap > 0; gap /= 2) {
            System.out.println(String.format("간격 %s로 배열 나누기", gap));

            for (int startIndex = 0; startIndex < gap; startIndex++) {
                this.insertionSortByGap(array, gap, startIndex);
            }
        }

        System.out.println("=========");
    }

    private void insertionSortByGap(int[] array, int gap, int startIndex) {
        for (int i = startIndex + gap; i < array.length; i += gap) {
            int j;
            int temp = array[i];

            for (j = i - gap;  j >= 0 && array[j] > temp; j -= gap) {
                array[j + gap] = array[j];
            }

            array[j + gap] = temp;
        }

        System.out.println(String.format("정렬 후 배열={}%s\n", Arrays.toString(array)));
    }
}