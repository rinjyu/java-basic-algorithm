package com.algorithm.chapter9;

public class InsertionSort {

     public int[] sort(int[] array) {
         for (int i = 1; i < array.length; i++) {
             int target = array[i];

             int j;
             for (j = i - 1; j >= 0 && array[j] > target; j--) {
                 array[j + 1] = array[j];
             }

             array[j + 1] = target;
         }

         return array;
     }
}
