package com.monocept.leetcode;

public class ClimbingStairs70LeetCode {
    public static void main(String[] args) {
        int s = 45;
        System.out.println(climbStairs(s));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
        return b;
    }
}
