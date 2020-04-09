package com.company.classwork.Lesson7;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("peek" + numbers.peek());
        System.out.println(numbers.size());


        System.out.println("poll" + numbers.poll());
        System.out.println(numbers.size());


        System.out.println("remove" + numbers.remove());
        System.out.println(numbers.size());

        System.out.println("poll" + numbers.poll());
        System.out.println(numbers.size());

        System.out.println("remove" + numbers.remove());
        System.out.println(numbers.size());

        System.out.println("poll" + numbers.poll());
        System.out.println(numbers.size());

    }
}
