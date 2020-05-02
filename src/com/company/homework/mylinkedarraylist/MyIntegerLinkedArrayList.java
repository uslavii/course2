package com.company.homework.mylinkedarraylist;


public class MyIntegerLinkedArrayList {

    int size = 0;
    Node first;
    Node last;

    public MyIntegerLinkedArrayList() {
    }

    private static class Node {
        int element;
        Node next;
        Node prev;

        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(int element) {
        Node last = this.last;
        Node newNode = new Node(element, null, last);
        this.last = newNode;
        if (last == null)
            first = newNode;
        else
            last.next = newNode;
        size++;
    }

    public void add(int index, int element) {
        if (!(index >= 0 && index <= size))
            throw new IllegalArgumentException("OutOfBoundsException");
        if (index == size)
            add(element);
        else {
            Node node = node(index);
            Node prev = node.prev;
            Node newNode = new Node(element,prev,node);
            node.prev = newNode;
            if (prev == null)
                first = newNode;
            else
                prev.next = newNode;
            size++;
        }
    }

    private Node node(int index) {
        if (index < (size >> 1)) {
            Node node = first;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node;
        } else {
            Node node = last;
            for (int i = size - 1; i > index; i--)
                node = node.prev;
            return node;
        }
    }

    public void remove(int index) {
        if (!(index >= 0 && index <= size))
            throw new IllegalArgumentException("OutOfBoundsException");
        Node node = node(index);
        int element = node.element;
        Node next = node.next;
        Node prev = node.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.element = 0;
        size--;

    }

    public int get(int index) {
        if (!(index >= 0 && index <= size))
            throw new IllegalArgumentException("OutOfBoundsException");
        return node(index).element;
    }

    public void set(int index, int element) {
        if (!(index >= 0 && index <= size))
            throw new IllegalArgumentException("OutOfBoundsException");
        Node node = node(index);
        int oldVal = node.element;
        node.element = element;
    }

    @Override
    public String toString() {
        String prev = "";
        String linkedListSting = "";
        for (int i = 0;i !=size  ; i++) {
            prev = linkedListSting + " " + get(i);
            linkedListSting = prev;
        }
        return linkedListSting;

    }
}
