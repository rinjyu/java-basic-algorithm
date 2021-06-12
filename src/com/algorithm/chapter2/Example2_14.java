package com.algorithm.chapter2;

import java.util.Scanner;

public class Example2_14 {

    public static void main(String[] args) {

        int[] array = new int[5];
        int sum = 0;

        System.out.println("5개의 양수를 입력해주세요.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i ++) {
            array[i] = scanner.nextInt();
        }

        for (int number: array) {
            sum += number;
        }

        System.out.println("모든 요소의 합계={}" + sum);
    }
}
