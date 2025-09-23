package com.monocept.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13LeetCode {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int num = romanToInt(roman);
        System.out.println(num);
    }

    private static Integer romanToInt(String roman) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int length = roman.length();
        for (int i = 0; i < length; i++) {
            if (i < length-1 && map.get(roman.charAt(i))<map.get(roman.charAt(i+1))){
                ans -= map.get(roman.charAt(i));
            }else
                ans+= map.get(roman.charAt(i));

        }

        return ans;
    }
}
