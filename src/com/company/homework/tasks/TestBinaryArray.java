package com.company.homework.tasks;

import java.util.Arrays;

public class TestBinaryArray {
    public static void main(String[] args) {
        int[][] binaryArray = new int[][]{
                {1, 2, 3, 4, 5},
                {100, 6, 7, 8},
        };
        System.out.println(Arrays.deepToString(binaryArray));
        System.out.println(Arrays.toString(searchBinaryArraysElement(binaryArray, 100)));

    }


    public static int[] searchBinaryArraysElement(int[][] binaryArray, int element) {
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray.length; j++) {
                if (binaryArray[i][j] == element) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not found element");
    }
}
