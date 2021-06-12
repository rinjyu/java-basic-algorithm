package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_10 {

    public static void main(String[] args) {

        String[] folder1 = {"Java", "Algorithm", "Basic"};
        System.out.println("clone() 메소드 호출");

        String[] folder2 = folder1.clone();
        folder2[0] = "Study";

        System.out.println("원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열={}" + Arrays.toString(folder2));

        System.out.println("\nSystem.arraycopy() 메소드 호출");

        String[] folder3 = new String[folder1.length];
        System.arraycopy(folder1, 0, folder3, 0, 2);
        folder3[0] = "Level up";

        System.out.println("원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열={}" + Arrays.toString(folder3));

        System.out.println("\nArrays.copyOf() 메소드 호출");

        String[] folder4 = Arrays.copyOf(folder1, 1);
        folder4[0] = "Daily";

        System.out.println("원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열={}" + Arrays.toString(folder4));

        System.out.println("\nArrays.copyOfRange() 메소드 호출");

        String[] folder5 = Arrays.copyOfRange(folder1, 0, 1);
        folder5[0] = "Weekly";

        System.out.println("원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열={}" + Arrays.toString(folder5));
    }
}
