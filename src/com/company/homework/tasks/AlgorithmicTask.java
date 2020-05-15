package com.company.homework.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AlgorithmicTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String input = " ";
        while (true) {
            input = reader.readLine();
            if (input.equals("")) break;
            arrayList.add(input);
        }
        arrayList = sort(arrayList);
        for (String entry : arrayList) {
            System.out.println(entry);
        }
    }

    public static ArrayList<String> sort(List<String> arrayList) {
        String[] arr = arrayList.toArray(new String[0]);
        String string = null;
        int int1 = 0;
        int int2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (comparison(arr[i], arr[j])) {
                    if (!isNumber(arr[i])) {
                        string = arr[i];
                        arr[i] = arr[j];
                        arr[j] = string;
                    }
                }

                if (isNumber(arr[i]) && isNumber(arr[j])) {
                    int1 = Integer.parseInt(arr[i]);
                    int2 = Integer.parseInt(arr[j]);
                    if (int1>int2) {
                        string = arr[i];
                        arr[i] = arr[j];
                        arr[j] = string;
                    }
                }
            }
        }
        List<String> list = Arrays.asList(arr);
        return new ArrayList<String>(list);
    }

    public static boolean comparison(String a, String b) {
        return a.compareTo(b) > 0;
    }


    public static boolean isNumber(String s) {
        return s.matches("^[0-9]*$");
    }
}
