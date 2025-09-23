package com.monocept.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290LeetCode {
    public static void main(String[] args) {
        String pattern = "abbc", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (characterIntegerMap.put(pattern.charAt(i), i) != stringIntegerMap.put(str[i], i)) {
                return false;
            }
        }


        return true;
    }
}
