package com.company.lesson1.stack;

import java.util.NoSuchElementException;

public class StackOfItem<Item> {

    private Node first = null;
    int size = 0;

    private class Node {
        Item item;
        Node next;
    }
    public Item peek(){
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    public void push(Item item) {
        size++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        size--;
        Item item = first.item;
        first = first.next;
        return item;
    }

    boolean isEmpty() {
        return first == null;
    }
}
