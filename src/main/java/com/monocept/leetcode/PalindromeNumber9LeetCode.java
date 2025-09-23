package com.monocept.leetcode;

public class PalindromeNumber9LeetCode {

    public static void main(String[] args) {
        int num = 12321;
        boolean b = palindromeNumber(num);
        System.out.println(b);
    }

    private static boolean palindromeNumber(int num) {
        if (num < 0) {
            return false;
        }

        if (num != 0 && num % 10 == 0) {
            return false;
        }

        int reverse = 0;
        while (num > reverse) {
            int lastdegit = num % 10;
            reverse = reverse * 10 + lastdegit;
            num = num / 10;
        }
        return num == reverse || num == reverse / 10;
    }
}
