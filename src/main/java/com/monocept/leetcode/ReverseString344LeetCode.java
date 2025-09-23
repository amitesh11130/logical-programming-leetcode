package com.monocept.leetcode;

import java.util.Arrays;
import java.util.concurrent.*;

public class ReverseString344LeetCode {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String reverse = reverseString(chars);
        System.out.println(reverse);
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Future<String> submit = executorService.submit(() -> reverseString(chars));
//        System.out.println(submit.get());
//        executorService.shutdown();
    }

    private static String reverseString(char[] ch) {
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;
            System.out.println("AA");
            start++;
            end--;
        }
        return Arrays.toString(ch);
    }

    private static void  aa(){
        System.out.println("ReverseString344LeetCode.aa");
    }
}
