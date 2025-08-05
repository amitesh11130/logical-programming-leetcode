package com.monocept.string;

import java.util.HashMap;
import java.util.Map;

public class AlphabeticSumReducer {

    public static void main(String[] args) {
        Map<String, Integer> map = getStringIntegerMap();

        String input = "S. KANAPATHY";
        int a = 0;
        int sum = 0;

        char[] ch = input.toCharArray();
        for (char c : ch) {
            String character = String.valueOf(c);
            System.out.println(character);
            if (map.containsKey(character)) {
                int num = map.get(character);
                System.out.println(num);
                a = num + a;
            }
        }
//        Integer sum = Stream.of(String.valueOf(a).split(""))
//                       .mapToInt(Integer::parseInt).sum();

        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }

    private static Map<String, Integer> getStringIntegerMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("I", 1);
        map.put("J", 1);
        map.put("Q", 1);
        map.put("Y", 1);

        map.put("B", 2);
        map.put("K", 2);
        map.put("R", 2);

        map.put("C", 3);
        map.put("G", 3);
        map.put("L", 3);
        map.put("S", 3);

        map.put("D", 4);
        map.put("M", 4);
        map.put("T", 4);

        map.put("E", 5);
        map.put("H", 5);
        map.put("N", 5);
        map.put("X", 5);

        map.put("U", 6);
        map.put("V", 6);
        map.put("W", 6);

        map.put("O", 7);
        map.put("Z", 7);

        map.put("F", 8);
        map.put("P", 8);
        return map;
    }
}
