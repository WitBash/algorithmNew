package com.bashko.homework3;

import java.util.NoSuchElementException;

public class MyArrayQueue<T> {
    private Object[] queue = new Object[2];
    private int size = 0;
    private int start = 0;
    private int end = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[start + i];
        }
        queue = temp;
        start = 0;
        end = size;
    }

    public void enqueue(T t) {
        if (size == queue.length) {
            resize(queue.length * 2);
        }
        queue[end++] = t;
        size++;
        end %=queue.length;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) queue[start];
        queue[start] = null;
        size--;
        start++;
        start %=queue.length;
        if (size > 0 && size == queue.length / 4) {
            resize(queue.length / 2);
        }
        return t;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) queue[start];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + queue[(start+i)%queue.length] + ", ";
        }
        return s;
    }
}
