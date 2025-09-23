package com.monocept.leetcode;

/*
1 -> A
2 -> B
3 -> C
...
26 -> Z
27 -> AA
28 -> AB
 */

public class ExcelSheetColumnTitle168LeetCode {
    public static void main(String[] args) {
        int columnNumber = 703;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            result.append((char) ('A' + rem));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
