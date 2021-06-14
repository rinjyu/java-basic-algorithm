package com.algorithm.chapter4;

import java.util.Scanner;

public class Example4_5 {

    public static void main(String[] args) {

        System.out.println("원반의 개수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int disks = scanner.nextInt();

        System.out.println("결과={}");
        topOfHanoi(disks, "A", "B", "C");
    }

    public static void topOfHanoi(int disks, String begin, String middle, String end) {

        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮김", end));
            return;
        }

        topOfHanoi(disks - 1, begin, end, middle);

        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮김", disks, end));

        topOfHanoi(disks - 1, middle, begin, end);
    }
}
