package com.bashko.homework3;

import java.util.NoSuchElementException;

public class MyArrayStack<T> {
    private Object[] stack = new Object[1];

    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    public void push(T t) {
        if (size == stack.length) {
            resize(stack.length * 2);
        }
        stack[size++] = t;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) stack[size - 1];
        stack[size - 1] = null;
        size--;
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2);
        }
        return t;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) stack[size - 1];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + stack[i] + ", ";
        }
        return s;
    }
}
