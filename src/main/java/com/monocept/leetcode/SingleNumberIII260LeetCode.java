package com.monocept.leetcode;

import java.util.*;

public class SingleNumberIII260LeetCode {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(arr)));

    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int i = 0;

        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
               ans[i++] = entry.getKey();
            }
        }

        return ans;
    }
}
