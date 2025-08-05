package com.monocept.array;

import java.util.Arrays;

public class SortingAccordingToAnotherArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(sortingAccordingToAnotherArray(arr1, arr2)));
    }

    private static int[] sortingAccordingToAnotherArray(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length];
        int j = 0;

        for (int a : arr2) {
            for (int b : arr1) {
                if (a == b) {
                    result[j++] = a;
                }
            }
        }
        int[] remaining = new int[arr1.length - j];
        int k = 0;
        for (int num : arr1) {
            if (notContain(num, result)) {
                remaining[k++] = num;
            }
        }
        Arrays.sort(remaining);
        for (int i : remaining) {
            result[j] = i;
            j++;
        }
        return result;
    }

    private static boolean notContain(int num, int[] arr1) {
        for (int j : arr1) {
            if (j == num) {
                return false;
            }
        }
        return true;
    }
}
