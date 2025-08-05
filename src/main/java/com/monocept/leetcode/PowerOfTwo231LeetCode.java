package com.monocept.leetcode;

public class PowerOfTwo231LeetCode {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));

    }

    public static boolean isPowerOfTwo(int n) {
//        return n >= 0 && Integer.bitCount(n) == 1;

        if (n <= 0){
            return false;
        }
        while (n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}
