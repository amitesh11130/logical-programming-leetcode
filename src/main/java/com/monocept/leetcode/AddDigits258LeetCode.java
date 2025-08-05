package com.monocept.leetcode;

public class AddDigits258LeetCode {
    public static void main(String[] args) {
        int num = 53877;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
      return   1 + (num - 1) % 9;
    }
}
