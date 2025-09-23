package com.monocept.leetcode;


public class ValidAnagram242LeetCode {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(checkValidAnagram(s1, s2));
    }

    private static boolean checkValidAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            count[s2.charAt(i) - 'a']--;
            if (count[s2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }
}
