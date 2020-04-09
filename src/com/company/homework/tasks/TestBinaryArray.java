package com.company.homework.tasks;

import java.util.Arrays;

public class TestBinaryArray {
    public static void main(String[] args) {
        int[][] binaryArray = new int[2][5];
        for (int i = 0; i < 5; i++) {
            binaryArray[0][i] = i;
            binaryArray[1][i] = i;
            binaryArray[1][3] = 12;
        }
        System.out.println(Arrays.binarySearch(binaryArray[2], 12 ));
    }
}
