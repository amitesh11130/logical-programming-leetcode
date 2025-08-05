package com.monocept.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindNthHighestNumber {

    public static void main(String[] args) {
        int[] arrOfNum = {2, 100, 2, 4, 4, 22, 77, 11, -1, -55, 90, 90, 85, -22, 100};
        int place = 2;

        System.out.println(findNthSmallestNumber(arrOfNum, place));
        System.out.println(findNthHighestNumber(arrOfNum, place));
    }

    private static int findNthSmallestNumber(int[] arrOfNum, int place) {
        Optional<Integer> s = Arrays.stream(arrOfNum).distinct()
                .boxed()
                .sorted(Comparator.comparingInt(a -> a))
                .skip(place - 1)
                .findFirst();
        return s.orElse(Arrays.stream(arrOfNum).min().orElse(0));
    }

    private static int findNthHighestNumber(int[] arrOfNum, int place) {

        Optional<Integer> h = Arrays.stream(arrOfNum).distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(place - 1)
                .findFirst();
        return h.orElse(Arrays.stream(arrOfNum).max().orElse(0));
    }

}
