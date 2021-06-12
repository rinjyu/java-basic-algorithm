package com.algorithm.chapter2;

import java.util.Scanner;

public class Example2_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("대문자로 변환할 문자 1개를 입력해주세요.");
        String text = scanner.next();

        if (!(text.length() > 0 && text.length() < 2)) {
            System.out.println("문자 1개만 입력 가능합니다.");
        } else {
            System.out.println("입력받은 문자={}" + text);
            System.out.println("대문자로 변환한 문자={}" + convertUpper(text));
        }
    }

    public static String convertUpper(String text) {

        return text.toUpperCase();
    }
}
