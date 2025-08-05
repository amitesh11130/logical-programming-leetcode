package com.monocept.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber136LeetCode {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 1};
        int ans = singleNumber(array);
        System.out.println(ans);
    }

    private static int singleNumber(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < array.length; i++) {
//            if (set.contains(array[i])) {
//                set.remove(array[i]);
//            } else {
//                set.add(array[i]);
//            }
//        }
//        return set.iterator().next();

        int singleNum = 0;
        for (int num : array) {
            singleNum = singleNum ^ num;
            System.out.println(singleNum);
        }
        return singleNum;
    }
}
