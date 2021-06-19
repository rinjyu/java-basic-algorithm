package com.algorithm.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example7_2 {

    public static void main(String[] args) {

        System.out.println("생성할 배열의 크기={}");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];

        int index = 0;
        while (index < size) {
            int value = random.nextInt(size + 1);
            boolean isContains = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    isContains = true;
                    break;
                }
            }

            if (!isContains) {
                array[index++] = value;
            }
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.descSort(array);

        System.out.println(Arrays.toString(array));
    }
}
