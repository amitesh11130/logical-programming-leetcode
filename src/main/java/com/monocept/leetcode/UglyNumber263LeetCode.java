package com.monocept.leetcode;

public class UglyNumber263LeetCode {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isUgly(num));
    }

    public static boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }

        for (int prime : new int[]{2, 3, 5}) {
            while (n % prime == 0) {
                n = n / prime;
            }
        }
        return n == 1;
    }
}
