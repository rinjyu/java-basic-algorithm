package com.algorithm.chapter4;

import java.util.Scanner;

public class Example4_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("x의 값을 입력해주세요.");

        int x = scanner.nextInt();

        System.out.println("n의 값을 입력해주세요.");

        int n = scanner.nextInt();

        System.out.println(String.format("%d의 %d 제곱근은 %s입니다.", x, n, pow(x, n)));

    }

   public static int pow(int x, int n) {

        if (n == 1) {
            return x;
        }

        return x * pow(x, n - 1);
    }
}
