package com.algorithm.chapter5;

import java.util.Scanner;

public class Example5_5 {

    public static void main(String[] args) {

        LinkedListQueue linkedListQueue = new LinkedListQueue();

        int count = 1;
        int size = 0;
        boolean isStop = false;

        while (!isStop) {
            System.out.println("1번 대기표 발급");
            System.out.println("2번 입장");
            System.out.println("3번 총 인원 확인");
            System.out.println("4번 종료");
            System.out.println("숫자를 입력해주세요.");
            System.out.println("입력={}");

            Scanner scanner = new Scanner(System.in);

            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    linkedListQueue.enqueue(count);
                    System.out.println(String.format("대기 번호 %s 발급", count));

                    count++;
                    size++;
                    break;

                case 2:
                    if (linkedListQueue.empty()) {
                        System.out.println("현재 대기 인수 0");
                        break;
                    }

                    int number = (int) linkedListQueue.dequeue();
                    System.out.println(String.format("%s번 창구 이용", number));
                    size--;
                    break;

                case 3:
                    System.out.println(String.format("현재 인원은 %s명", size));

                case 4:
                    System.out.println("종료");
                    isStop = true;
                    break;

                default:
                    System.out.println("1번 대기표 발급");
                    System.out.println("2번 입장");
                    System.out.println("3번 총 인원 확인");
                    System.out.println("4번 종료");
                    System.out.println("숫자를 입력해주세요.");
                    System.out.println("입력={}");
            }
        }
    }
}
