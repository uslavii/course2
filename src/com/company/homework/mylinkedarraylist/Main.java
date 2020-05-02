package com.company.homework.mylinkedarraylist;

public class Main {

    public static void main(String[] args) {
        MyIntegerLinkedArrayList arrayList = new MyIntegerLinkedArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.toString());

        System.out.println();
        arrayList.set(2,100);
        System.out.println(arrayList.toString());

        System.out.println();
        arrayList.add(4,200);
        System.out.println(arrayList.toString());

        System.out.println();
        arrayList.remove(1);
        System.out.println(arrayList.toString());
    }
}
