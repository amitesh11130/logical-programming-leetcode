package com.monocept.leetcode;

public class BestTimeToBuyAndSellStock121LeetCode {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 40};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }

        }
        return maxProfit;
    }
}
