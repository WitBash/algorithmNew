package com.bashko.homework2;

public class MyArray {
    private int[] array;
    private int size;

    public int getArrayMember(int index) {
        return array[index];
    }

    public MyArray(int n) {
        this.array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        size = n;
    }

    private void resize(int capacity) {
        int[] tempArray = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        this.array = tempArray;
    }

    public void insert(int index, int value) {
        if (array[index] == 0) array[index] = value;
        else if (size == array.length) {
            resize(array.length + 1);
        }
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public boolean find(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return true;
        }
        return false;
    }

    public void delete(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = 0;
                size--;
            }
        }
    }

    public void selectionSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[min]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public void sortingInsert() {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s = s + array[i] + ", ";
        }
        return s;
    }
}
