package com.monocept.leetcode;

public class PowerOfNumber50LeetCode {
    public static void main(String[] args) {
        double x = 2.0000;
        int num = 10;
        double result = powOfNum(x, num);
        System.out.println(result);
    }

    private static double powOfNum(double x, int num) {
        long n = Math.abs((long) num);
        double result = 1.0;

        while (n != 0) {
            if (n % 2 == 1) {
                result = result * x;
                n = n - 1;
            }
            x = x * x;
            n = n / 2;
        }

        return num < 0 ? 1.0 / result : result;
    }
}
