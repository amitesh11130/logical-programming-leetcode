package com.monocept.leetcode;
/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
 */

public class ExcelSheetColumnNumber171LeetCode {

    public static void main(String[] args) {
        String input = "AAA";
        System.out.println(titleToNumber(input));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;

            result = result * 26 + value;
        }
        return result;
    }
}
