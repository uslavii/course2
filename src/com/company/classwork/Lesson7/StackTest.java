package com.company.classwork.Lesson7;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();

        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);
        integers.push(666);

        System.out.println("on the top " + integers.peek());
        System.out.println("size " + integers.size());
        System.out.println("get top " + integers.pop());
        System.out.println("size " + integers.size());
        System.out.println("get top " + integers.pop());
    }

}
