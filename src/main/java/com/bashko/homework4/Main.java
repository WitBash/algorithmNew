package com.bashko.homework4;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.insertFirst(5);
        list.insertLast(6);
        list.insertFirst(4);
        list.insertLast(7);
        list.insertFirst(3);
        list.insertLast(8);

        list.deleteFirst();
        list.deleteLast();

        System.out.println("Первый элемент: " + list.getFirst());
        System.out.println("Последний элемент: " + list.getLast());
        list.insert(3,12);
        System.out.println("Вставленный элемент: " + list.get(3));
        list.delete(6);

        System.out.println("Усть ли элемент 5: " + list.find(5));

        for(Integer o: list){
            System.out.println(o);
        }

        list.set(1,55);
        System.out.println("Усть ли элемент 5: " + list.find(5));

        for(Integer o: list){
            System.out.println(o);
        }
    }
}
