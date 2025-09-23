package com.monocept.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        //   System.out.println(productOfArrayExceptSelf(array));//Output: [24,12,8,6]
        int[] result = productOfArrayExceptS(array);
        System.out.println(Arrays.toString(result));
    }

    private static List<Integer> productOfArrayExceptSelf(int[] array) {
        List<Integer> list = new ArrayList<>();
        int product = Arrays.stream(array)
                .reduce(1, (a, b) -> a * b);
        for (int i : array) {
            int p = product / i;
            list.add(p);
        }
        return list;
    }

    private static int[] productOfArrayExceptS(int[] array) {
        int n = array.length;
        int[] output = new int[n];

        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * array[i - 1];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= array[i];
        }

        return output;
    }

}
