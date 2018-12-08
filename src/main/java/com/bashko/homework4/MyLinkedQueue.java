package com.bashko.homework4;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<T>();

    public void enqueue(T t) {
        queue.insertLast(t);
    }

    public T dequeue() {
        return queue.deleteFirst();
    }

    public T peekFront() {
        return queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
