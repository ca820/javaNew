package com.company.lesson1.stack;

public class stackOfStrings {
    private Node first = null;
    int size = 0;

    private class Node {
        string item;
        Node item;
    }

    public void push(String item) {
        size++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public void pop() {
        size++;
        String item = first.item;
        first = first.next;
        return item;
    }

    boolean isEmpty() {
        return first == null;
    }
}
