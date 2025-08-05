package com.monocept.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229LeetCode {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count += 1;
//                }
//            }
//
//            if (count > nums.length / 3) {
//                if (list.isEmpty() || !list.contains(nums[i])) {
//                    list.add(nums[i]);
//                }
//            }
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val + 1);

            if (val + 1 > nums.length / 3 && !list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
