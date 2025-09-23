package com.monocept.leetcode;

public class IntegerToEnglishWords273LeetCode {

    public static void main(String[] args) {
        int num = 214748364;
        System.out.println(numberToWords(num));
    }

    public static String numberToWords(int num) {

        return num == 0 ? "Zero" : words(num);
    }

    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String words(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if (num < 20) {
            stringBuilder.append(belowTwenty[num]);
        } else if (num < 100) {
            stringBuilder.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
        } else if (num < 1000) {
            stringBuilder.append(words(num / 100)).append(" Hundred ").append(words(num % 100));
        }else if (num < 1000000) {
            stringBuilder.append(words(num / 1000)).append(" Thousand ").append(words(num % 1000));
        }else if (num < 1000000000) {
            stringBuilder.append(words(num / 1000000)).append(" Million ").append(words(num % 1000000));
        }else  {
            stringBuilder.append(words(num / 1000000000)).append(" Billion ").append(words(num % 1000000000));
        }
        return stringBuilder.toString().trim();

    }
}
