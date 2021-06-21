package com.algorithm.chapter13;

public class Example13_3 {

    public static void main(String[] args) {

        BankBook bankBook = new BankBook();

        for (int i = 0; i < 3; i++) {
            String name = "Person" + i;
            new Person(bankBook, name).start();
        }
    }
}
