package com.monocept.leetcode;

import java.util.HashSet;

public class MissingNumber268LeetCode {

    /*
    Follow up: Could you implement a solution using only O(1) extra space complexity
     and O(n) runtime complexity?
     */
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) return i;
        }
        return -1;
    }
}
