package com.algorithm.chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Example13_10 {

    public static void main(String[] args) {

        Random random = new Random();
        Set lotto = new HashSet<Integer>(){{
            add(15);
            add(27);
            add(13);
            add(12);
            add(41);
            add(43);
        }};

        Set<Integer> myLotto = new HashSet<>();
        while (myLotto.size() < lotto.size()) {
            int number = random.nextInt(45);
            if (number == 0) {
                continue;
            }

            myLotto.add(number);
        }

        int count = 0;

        Iterator iterator = myLotto.iterator();
        while (iterator.hasNext()) {
            if (!lotto.contains(iterator.next())) {
                continue;
            }
            count++;
        }

        switch (count) {
            case 2:
                System.out.println("5등 당첨");
                System.out.println("수령 금액: 5,000원");
                break;
            case 3:
                System.out.println("4등 당첨");
                System.out.println("수령 금액: 50,000원");
                break;
            case 4:
                System.out.println("3등 당첨");
                System.out.println("수령 금액: 1,000,000원");
                break;
            case 5:
                System.out.println("2등 당첨");
                System.out.println("수령 금액: 50,000,000원");
                break;
            case 6:
                System.out.println("1등 당첨");
                System.out.println("수령 금액: 100,000,000원");
                break;
            default:
                System.out.println("미당첨");
        }
    }
}
