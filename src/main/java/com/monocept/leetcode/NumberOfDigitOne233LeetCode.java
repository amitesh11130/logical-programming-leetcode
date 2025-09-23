package com.monocept.leetcode;

public class NumberOfDigitOne233LeetCode {
    public static void main(String[] args) {
        int n = 13; //output = 6  {1 2 3 4 5 6 7 8 9 10 11 12 13} = 6 one
        System.out.println(countDigitOne(n));
    }

    public static int countDigitOne(int n) {
        int count = 0;

        for (int i = 1; i <= n; i *= 10) {
            int div = i * 10;
            int que = n / div;
            int rem = n % div;

            if (que > 0) {
                count += que * i;
            }
            if (rem >= i) {
                count += Math.min(rem - i + 1, i);
            }
        }
        return count;
    }
}
