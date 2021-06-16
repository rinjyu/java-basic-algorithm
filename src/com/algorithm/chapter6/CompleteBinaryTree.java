package com.algorithm.chapter6;

public class CompleteBinaryTree {

    public void printAll(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int leftNode = this.getLeftNode(array, i);
            int rightNode = this.getRightNode(array, i);

            if (leftNode > -1) {
                System.out.println(String.format("%d의 왼쪽 자식 노드는 %d", array[i], leftNode));
            }

            if (rightNode > -1) {
                System.out.println(String.format("%d의 오른쪽 자식 노드는 %d", array[i], rightNode));
            }
        }
    }

    private int getLeftNode(int[] array, int index) {
        int findIndex = 2 * index;
        if (array.length <= findIndex) {
            return -1;
        }

        return array[findIndex];
    }

    private int getRightNode(int[] array, int index) {
        int findIndex = (2 * index) + 1;
        if (array.length <= findIndex) {
            return -1;
        }

        return array[findIndex];
    }
}
