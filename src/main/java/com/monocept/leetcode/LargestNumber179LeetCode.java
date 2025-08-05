package com.monocept.leetcode;

import java.util.Arrays;

public class LargestNumber179LeetCode {

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 9, 5};
        System.out.println(largestNumber(nums));

    }

    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        if (strNums[0].equals("0")) return "0";
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }
}
