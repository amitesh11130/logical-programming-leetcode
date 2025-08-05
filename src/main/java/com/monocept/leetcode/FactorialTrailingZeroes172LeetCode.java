package com.monocept.leetcode;

public class FactorialTrailingZeroes172LeetCode {

    /*
    Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Formula for trailing zeros in n!:
Trailing Zeros = n/5 + n/25 + n/125 +...

Keep dividing by powers of 5 until the result is 0.
     */
    public static void main(String[] args) {

        int n = 25;
        int ans = trailingZeroes(n);
        System.out.println(ans);

    }

    private static int trailingZeroes(int n) {

        int count = 0;
        int currentPowerOfFive = 5;
        while (n >= currentPowerOfFive) {                    //n! = n/5 + n/25 + n/125 ...
            count += n / currentPowerOfFive;
            currentPowerOfFive *= 5;
        }
        return count;
//        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
