package com.algorithm.chapter6;

public class Example6_10 {

    public static void main(String[] args) {

        MinHeapTree minHeapTree = new MinHeapTree(6);
        minHeapTree.insert(14);
        minHeapTree.insert(11);
        minHeapTree.insert(6);
        minHeapTree.insert(12);
        minHeapTree.insert(5);
        minHeapTree.insert(3);

        minHeapTree.print();
    }
}
