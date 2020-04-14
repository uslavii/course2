package com.company.homework.myarraylist;

public class Main {

    public static void main(String[] args) {
        MyStringArrayList arrayList = new MyStringArrayList(5);
        for (int i = 0; i < arrayList.getSize() ; i++) {
            arrayList.set(i,"string");
        }

        arrayList.add("lastString");

        arrayList.add(2,"s");

        arrayList.remove(1);

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.toString());
    }
}
