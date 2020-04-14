package com.company.homework.myarraylist;

import java.util.Arrays;
import java.util.Objects;

public class MyStringArrayList {
    private static final int DEFAULT_CAPACITY = 10;

    private static final String[] DEFAULT_CAPACITY_EMPTY_ELEMENTDATA = {};

    private int size;

    private String[] elementData;



    public MyStringArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new String[initialCapacity];
            size = elementData.length;
        } else {
            throw new IllegalArgumentException("illegal capacity" + initialCapacity);
        }
    }

    public MyStringArrayList() {
        this.elementData = new String[DEFAULT_CAPACITY];
    }

    public void trimToSize() {
        if (size < elementData.length) {
            elementData = Arrays.copyOf(elementData, size);
        }
    }

    private String[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    private String[] grow() {
        return grow(size + 1);
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity <=0) {
            if (elementData == DEFAULT_CAPACITY_EMPTY_ELEMENTDATA)
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            if (minCapacity < 0)
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return newCapacity;
    }

    public String get(int index) {
        return elementData[index];
    }

    public void set(int index, String element) {
        elementData[index] = element;
    }

    public void add(String element) {
        elementData = Arrays.copyOf(elementData, elementData.length + 1);
        elementData[elementData.length - 1] = element;
        size +=1;
    }


    public void add(int index, String element) {
        final int s;
        Object[] elementData;
        if ((s = size) == (elementData = this.elementData).length)
            elementData = grow();
        System.arraycopy(elementData, index, elementData, index + 1, s - index);
        elementData[index] = element;
        size = s + 1;
    }

    public String remove(int index) {
        Objects.checkIndex(index,size);
        String[] es = elementData;
        String oldValue = es[index];
        final int newSize;
        if ((newSize = size - 1) > index)
            System.arraycopy(es, index + 1, es, index, newSize - index);
        es[size = newSize] = null;
        return oldValue;


    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        trimToSize();
        return "MyStringArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
