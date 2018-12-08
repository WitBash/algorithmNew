package com.bashko.homework4;

public class MyLinkedStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<T>();

    public void push(T t) {
        stack.insertLast(t);
    }

    public T pop() {
        return stack.deleteLast();
    }

    public T peek() {
        return stack.getLast();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
