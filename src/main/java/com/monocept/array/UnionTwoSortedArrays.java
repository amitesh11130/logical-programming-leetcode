package com.monocept.array;

import java.util.*;

public class UnionTwoSortedArrays {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4, 4, 4};
        int[] array2 = {2, 3, 4, 4, 5, 6, 7};
        unionTwoSortedArrays(array1, array2);
        List<Integer> integers = unionTwoSortedArrays2(array1, array2);
        System.out.println(integers);
    }

    private static void unionTwoSortedArrays(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }
        for (int i : array2) {
            set.add(i);
        }
        System.out.println("Union two sorted array are : " + set);
    }

    private static List<Integer> unionTwoSortedArrays2(int[] array1, int[] array2) {

        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != array1[i]) {
                    list.add(array1[i]);

                }
                i++;
            } else if (array1[i] > array2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != array2[j]) {
                    list.add(array2[j]);
                }
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != array1[i]) {
                    list.add(array1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < array1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != array1[i]) {
                list.add(array1[i]);
            }
            i++;
        }
        while (j < array2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != array2[j]) {
                list.add(array2[j]);
            }
            j++;
        }
        return list;
    }
}
