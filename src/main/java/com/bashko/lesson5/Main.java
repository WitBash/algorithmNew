package com.bashko.lesson5;

public class Main {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        System.out.println(digitSum(325));
        double stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }

    public static int phibo(int n) {
        int f_curr = 1, f_prev = 0, index = 1;
        int f_next = 0;
        while (index < n) {
            f_next = f_prev + f_curr;
            f_prev = f_curr;
            f_curr = f_next;
            index++;
        }
        return f_curr;
    }

    public static int phiboRec(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return phiboRec(n - 1) + phiboRec(n - 2);
        }
    }

    public static int fact(int n) {
        int product = 1;
        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }

    public static int factRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factRec(n - 1) * n;
        }
    }

    public static int triangle(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public static int triangleRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return triangleRec(n - 1) + n;
        }
    }

    public static int product(int a, int b) {
        int sum = 0;
        while (b > 0) {
            sum += a;
            b--;
        }
        return sum;
    }

    public static int productRec(int a, int b) {
        if (b == 1) {
            return a;
        } else if (a == 0 || b == 0) {
            return 0;
        } else {
            return productRec(a, b - 1) + a;
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int digitSumRec(int n) {
        if (n < 10) {
            return n;
        } else {
            return digitSum(n / 10) + n % 10;
        }
    }
}
