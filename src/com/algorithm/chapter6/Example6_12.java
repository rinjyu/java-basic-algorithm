package com.algorithm.chapter6;

public class Example6_12 {

    public static void main(String[] args) {

        MaxHeapTree maxHeapTree = new MaxHeapTree(7);
        maxHeapTree.insert(10);
        maxHeapTree.insert(5);
        maxHeapTree.insert(12);
        maxHeapTree.insert(20);
        maxHeapTree.insert(1);
        maxHeapTree.insert(100);
        maxHeapTree.insert(21);

        maxHeapTree.delete();
        maxHeapTree.print();
    }
}
