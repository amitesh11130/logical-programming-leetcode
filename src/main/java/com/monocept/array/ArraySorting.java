package com.monocept.array;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] array = {0, 5, 3, 1, 5, 88, 33, 77};
        selectionSorting(array);
        bubbleSorting(array);
    }

    private static void bubbleSorting(int[] array) {
    }

    private static void selectionSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j <= array.length - 1; j++) {
                int min = i;
                if (array[j] < array[min]) {
                    min = j;
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
