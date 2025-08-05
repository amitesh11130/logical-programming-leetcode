package com.monocept.string;

public class Nu_Number {

    public static void main(String[] args) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int[] arrOfNum = {2, 100, 2, 4, 4, 22, 77, 11, -1, -55, 90, 90, 85, -22, 100};

        for (int num : arrOfNum) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num < highest && num > secondHighest) {
                secondHighest = num;
            }
        }

        System.out.println(secondHighest);
    }

}
