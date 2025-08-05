package com.monocept.leetcode;

public class BasicCalculatorII227LeetCode {
    public static void main(String[] args) {
        String s = " 3+5 / 2 ";
        System.out.println(calculate(s));
    }

    /*
    Given a string s which represents an expression, evaluate this expression and return its value.
     */
    public static int calculate(String s) {
        String s1 = s.replaceAll("\\s+", "");
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s1.charAt(i + 1) == '+') {

            }
        }
        return result;
    }
}
