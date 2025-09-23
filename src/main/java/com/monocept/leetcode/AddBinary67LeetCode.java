package com.monocept.leetcode;

import java.math.BigInteger;

public class AddBinary67LeetCode {

    public static void main(String[] args) {
        String s1 = "10101";
        String s2 = "1101";
        System.out.println(addBinary(s1, s2));

    }

    public static String addBinary(String a, String b) {

        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);
        BigInteger sum = b1.add(b2);
        return sum.toString(2);
    }
}
