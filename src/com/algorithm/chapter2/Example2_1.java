package com.algorithm.chapter2;

public class Example2_1 {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 1;
        arrayInit(ARRAY_LENGTH);
    }

    public static void arrayInit(int arrayLength) {

        String[] strings = new String[arrayLength];
        byte[] bytes = new byte[arrayLength];
        short[] shorts = new short[arrayLength];
        int[] ints = new int[arrayLength];
        float[] floats = new float[arrayLength];
        long[] longs = new long[arrayLength];
        double[] doubles = new double[arrayLength];
        boolean[] booleans = new boolean[arrayLength];

        System.out.println("참조 타입의 초기값={}" + strings[0]);
        System.out.println("byte 타입의 초기값={}" + bytes[0]);
        System.out.println("short 타입의 초기값={}" + shorts[0]);
        System.out.println("int 타입의 초기값={}" + ints[0]);
        System.out.println("float 타입의 초기값={}" + floats[0]);
        System.out.println("long 타입의 초기값={}" + longs[0]);
        System.out.println("double 타입의 초기값={}" + doubles[0]);
        System.out.println("boolean 타입의 초기값={}" + booleans[0]);

    }
}
