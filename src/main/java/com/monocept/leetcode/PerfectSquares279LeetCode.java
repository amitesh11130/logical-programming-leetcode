package com.monocept.leetcode;

import java.util.Arrays;

public class PerfectSquares279LeetCode {
    /*
    A perfect square is an integer that is the square of an integer; in other words,
     it is the product of some integer with itself. For example, 1, 4, 9, and 16 are
     perfect squares while 3 and 11 are not
     */
    public static void main(String[] args) {
        int num = 20;
        System.out.println(numSquares(num));
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        System.out.println(Arrays.toString(dp));
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(Arrays.toString(dp));

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j * j <= i; ++j) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
