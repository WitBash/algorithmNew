package com.bashko.lesson6;

import java.util.Random;

public class MainHomeWork6 {
    private static BST<Integer, Integer> assArr;
    private static int count = 0;
    private static double isNotBalanced = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            assArr = createBST();
            if (!assArr.isBalanced()) {
                count++;
            }
        }
        isNotBalanced = (double) count / 20 * 100;
        System.out.println("Количество несбалансированных деревьев составляет "
                + isNotBalanced + "%");
    }

    public static BST<Integer, Integer> createBST() {
        BST<Integer, Integer> assArr = new BST<Integer, Integer>();
        Random random = new Random();
        while (assArr.height() < 6) {
            assArr.put((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
        return assArr;
    }

}
