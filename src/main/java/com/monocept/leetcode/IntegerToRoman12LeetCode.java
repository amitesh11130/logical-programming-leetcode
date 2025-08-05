package com.monocept.leetcode;

public class IntegerToRoman12LeetCode {

    public static void main(String[] args) {
        int num = 3749;
        String ans = intToRoman(num);
        System.out.println(ans);
    }

    private static String intToRoman(int num) {

        int[] intValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanValue = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String ans = "";
        for (int i = 0; i < intValue.length; i++) {
            while (num >= intValue[i]) {
                ans += romanValue[i];
                num -= intValue[i];
            }
        }
        return ans;
    }
}
