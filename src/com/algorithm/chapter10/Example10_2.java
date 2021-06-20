package com.algorithm.chapter10;

import java.util.Arrays;

public class Example10_2 {

    public static void main(String[] args) {

        String[] studentFile = {
                "D/22", "A/14", "T/03", "F/09", "S/15",
                "B/10", "R/01", "J/05", "H/23", "Y/08"
        };

        sort(studentFile, "name");
        System.out.println(String.format("학생 이름(오름차순): %s", Arrays.toString(studentFile)));

        sort(studentFile, "number");
        System.out.println(String.format("학생 번호(오름차순): %s", Arrays.toString(studentFile)));
    }

    private static void sort(String[] array, String type) {
        int length = array.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int startIndex = 0; startIndex < gap; startIndex++) {
                insertionSortByGap(array, gap, startIndex, type);
            }
        }
    }

    private static void insertionSortByGap(String[] array, int gap, int startIndex, String type) {
        int valueIndex = "name".equals(type) ? 0 : 1;
        for (int i = startIndex + gap; i < array.length; i += gap) {
            String target = array[i];

            int j;
            for (j = i - gap; j >= 0; j -= gap) {
                if (compare(array[j], target, valueIndex)) {
                    break;
                }
                array[j + gap] = array[j];
            }
            array[j + gap] = target;
        }
    }

    private static boolean compare(String compareTarget, String originTarget, int valueIndex) {
        if (valueIndex == 0) {
            int compareHashCode = compareTarget.split("/")[valueIndex].hashCode();
            int originHashCode = originTarget.split("/")[valueIndex].hashCode();

            if (compareHashCode < originHashCode) {
                return true;
            }
        } else {
            int compareHashCode = Integer.valueOf(compareTarget.split("/")[valueIndex]);
            int originHashCode = Integer.valueOf(originTarget.split("/")[valueIndex]);
            if (compareHashCode < originHashCode) {
                return true;
            }
        }

        return false;
    }
}
