package com.bashko.homework2;

public class Program1 {
    final static int n = 1000000;

    public static void main(String[] args) {

        MyArray arrayA = new MyArray(n);
        long a = System.currentTimeMillis();
        arrayA.selectionSorted();
        System.currentTimeMillis();
        System.out.println("Сортировка методом выбора: " + (System.currentTimeMillis() - a));

        MyArray arrayB = new MyArray(n);
        long b = System.currentTimeMillis();
        arrayB.sortingInsert();
        System.currentTimeMillis();
        System.out.println("Сортировка методом вставки: " + (System.currentTimeMillis() - b));


        arrayB.insert(5, 111);
        System.out.println(arrayB.find(1));
        System.out.println(arrayB.find(111));
        System.out.println(arrayB);
        arrayB.delete(111);
        System.out.println(arrayB);
        arrayB.insert(10, 333);
        System.out.println(arrayB);
        arrayB.insert(11, 334);
        System.out.println(arrayB);
    }
}
