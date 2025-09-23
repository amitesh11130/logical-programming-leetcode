package com.monocept.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String s = "Java Concept of the day";

        System.out.println(findFirstNonRepeatedCharacter(s));
        System.out.println(nonRepeatedCharacter(s));

    }

    private static String findFirstNonRepeatedCharacter(String s) {
        String value = s.replaceAll("\\s+", "").toLowerCase();

        LinkedHashMap<String, Long> collect = Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return collect.entrySet().stream().filter(entity -> entity.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse("");
    }

    public static String nonRepeatedCharacter(String s) {
        String value = s.replaceAll("\\s+", "").toLowerCase();
        Map<String, Integer> map = new LinkedHashMap<>();

        char[] ch = value.toCharArray();
        for (char c : ch) {
            String d = String.valueOf(c);
            if (!map.containsKey(d)) {
                map.put(d, 1);
            } else {
                map.put(d, map.get(d) + 1);
            }
        }
        return map.entrySet().stream().filter(entity -> entity.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse("");
    }

}