package com.monocept.leetcode;

public class LongestCommonPrefix14LeetCode {

    public static void main(String[] args) {
        String[] str = {"apple", "appetite", "application"};
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }

    private static String longestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
