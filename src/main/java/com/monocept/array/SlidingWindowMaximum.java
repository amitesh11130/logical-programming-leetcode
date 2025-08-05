package com.monocept.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SlidingWindowMaximum {
/*
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 */

    public static void main(String[] args) {
        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int s = 3;
        List<Integer> integers = slidingWindowMaximum(array, s);// Output: [3,3,5,5,6,7]
        System.out.println(integers);
    }

    private static List<Integer> slidingWindowMaximum(int[] array, int s) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= array.length - s; i++) {
            int[] num = new int[s];
            int index = 0;
            for (int j = i; j < s + i; j++) {
                num[index++] = array[j];
            }
            int max = Arrays.stream(num).max().isPresent() ? Arrays.stream(num).max().getAsInt() : 0;
            list.add(max);
        }
        return list;
    }
}
