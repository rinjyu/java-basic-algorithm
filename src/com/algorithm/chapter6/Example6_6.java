package com.algorithm.chapter6;

public class Example6_6 {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree0 = new BinarySearchTree();
        BinarySearchTree binarySearchTree1 = new BinarySearchTree();
        BinarySearchTree binarySearchTree2 = new BinarySearchTree();

        int array[] = new int[]{56, 10, 94, 8, 17, 77, 101, 3, 9, 12, 49, 63, 81, 99};
        for (int item : array) {
            binarySearchTree0.insert(item);
            binarySearchTree1.insert(item);
            binarySearchTree2.insert(item);
        }

        System.out.println("자식 노드가 없는 노드 3을 삭제한 결과={}");
        binarySearchTree0.delete(binarySearchTree0.getRoot(), 3);
        binarySearchTree0.breadthFirstSearch(binarySearchTree0.getRoot());
        System.out.println("\n");

        System.out.println("자식 노드가 1개인 노드 101을 삭제한 결과={}");
        binarySearchTree1.delete(binarySearchTree1.getRoot(), 101);
        binarySearchTree1.breadthFirstSearch(binarySearchTree1.getRoot());
        System.out.println("\n");

        System.out.println("자식 노드가 2개인 노드 94를 삭제한 결과={}");
        binarySearchTree2.delete(binarySearchTree2.getRoot(), 94);
        binarySearchTree2.breadthFirstSearch(binarySearchTree2.getRoot());
        System.out.println("\n");
    }
}
