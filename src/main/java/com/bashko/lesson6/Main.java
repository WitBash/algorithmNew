package com.bashko.lesson6;

public class Main {
    public static void main(String[] args) {
        BST<Character,Integer> assArr = new BST<Character, Integer>();

        assArr.put('P', 25);
        assArr.put('T', 32);
        assArr.put('K', 78);
        assArr.put('M', 25);
        assArr.put('C', 93);
        assArr.put('O', 39);
        assArr.put('L', 54);
        assArr.put('D', 72);

        System.out.println(assArr.size());

        System.out.println(assArr.contains('P'));
        System.out.println(assArr.contains('N'));
        System.out.println(assArr.contains('K'));
        assArr.delete('K');
        System.out.println();
        System.out.println(assArr.contains('K'));
    }
}
