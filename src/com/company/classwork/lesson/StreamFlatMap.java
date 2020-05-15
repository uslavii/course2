package com.company.classwork.lesson;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamFlatMap {
    public static void main(String[] args) {
        String[] strings = {"Java","Course"};
        Arrays.stream(strings)
                .map(string -> string.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }
}
