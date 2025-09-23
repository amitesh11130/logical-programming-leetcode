package com.monocept.string;

import java.util.*;

public class CheckListOfAnagram {

    public static void main(String[] args) {
        List<String> list = List.of("Net", "Ten", "Dad", "Add", "Medical", "Decimal", "Nile");
        checkListOfStringIsAnagram(list).forEach(System.out::println);
    }

    private static List<List<String>> checkListOfStringIsAnagram(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : list) {
            char[] charArray = s.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
