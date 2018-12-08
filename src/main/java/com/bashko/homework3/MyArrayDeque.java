package com.bashko.homework3;

import java.util.NoSuchElementException;

public class MyArrayDeque<T> {
    private Object[] deque = new Object[1];

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
            temp[i] = deque[i];
        }
        deque = temp;
    }

    public void insertLeft(T t) {
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        for (int i = size - 1; i >= 0; i--) {
            deque[i + 1] = deque[i];
        }
        deque[0] = t;
        size++;
    }


    public void insertRight(T t) {
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        deque[size++] = t;
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) deque[0];
        for (int i = 0; i < size; i++) {
            deque[i] = deque[i + 1];
        }
        size--;
        if (size > 0 && size == deque.length / 4) {
            resize(deque.length / 2);
        }
        return t;
    }

    public T removeRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) deque[size - 1];
        deque[size - 1] = null;
        size--;
        if (size > 0 && size == deque.length / 4) {
            resize(deque.length / 2);
        }
        return t;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + deque[i] + ", ";
        }
        return s;
    }
}
