package com.bashko.homework5;

public class Main {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        System.out.println(fastExponentiationRec(9, 11));
        double stop = System.currentTimeMillis();
        System.out.println((stop - start)/1000);
    }

    public static long exponentiation(int a, int b) {
        long result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }

    public static long exponentiationRec(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return exponentiationRec(a, b - 1) * a;
        }
    }

    public static long fastExponentiationRec(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (a == 0 || b == 0) {
            return 0;
        } else if (b % 2 == 0) {
            return fastExponentiationRec(a * a, b / 2);
        } else {
            return fastExponentiationRec(a * a, (b - 1) / 2) * a;
        }
    }
}
