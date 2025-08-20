package com.monocept.leetcode;


import java.util.Arrays;

public class FindTheDuplicateNumber287LeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0){
                return Math.abs(num);
            }
            nums[index] = -nums[index];
        }
        return -1;
    }
}
