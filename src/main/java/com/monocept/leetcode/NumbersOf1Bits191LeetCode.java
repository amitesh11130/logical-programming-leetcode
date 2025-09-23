package com.monocept.leetcode;

public class NumbersOf1Bits191LeetCode {

    public static void main(String[] args) {
        int n = 6989;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);

        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
