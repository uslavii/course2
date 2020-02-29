package com.company.classwork.lesson3;

public class MemoryTest {

    public static void main(String[] args) {
        int  num = 9000;
        Object object = new Object();
        MemoryTest memory = new MemoryTest();
        memory.exMethod(object);
    }

    private void exMethod(Object param) {
        String string = "String";
        System.out.println(string);
    }
}
