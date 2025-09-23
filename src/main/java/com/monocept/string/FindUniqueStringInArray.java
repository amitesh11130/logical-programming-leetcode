package com.monocept.string;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueStringInArray {

    public static void main(String[] args) {

        String[] arr = {"Apple", "Sample", "Walter", "Array"};
        System.out.println(findUniqueStringInArray(arr));
    }

    private static List<String> findUniqueStringInArray(String[] arr) {

        List<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = true;
            char[] ch = s.toLowerCase().toCharArray();

            for (int i = 0; i < ch.length; i++) {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        b = false;
                        break;
                    }
                }
                if (!b) break;
            }
            if (b) {
                list.add(s);
            }
        }

        return list;
    }
}
