package com.algorithm.chapter4;

public class Example4_7 {

    public static void main(String[] args) {

        print(4);
    }

    public static void space(int space) {

        if (space == 0) {
            return;
        }
        System.out.print(" ");
        space(space - 1);
    }

    public static void asterisk(int asterisk) {

        if (asterisk == 0) {
            return;
        }
        System.out.print("* ");
        asterisk(asterisk - 1);
    }

    public static void print(int number) {

        if (number == 0) {
            return;
        }
        space(number - 1);
        asterisk(5 - number);
        System.out.println("");
        print(number - 1);
    }
}
