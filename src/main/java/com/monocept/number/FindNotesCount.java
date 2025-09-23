package com.monocept.number;

public class FindNotesCount {

    public static void main(String[] args) {
        int[] notes = {500, 100, 50, 10};
        int amount = 1560;
        System.out.println(findNotesCount(notes, amount));
    }

    private static int findNotesCount(int[] notes, int amount) {

        int count = 0;
        int amt = amount;
        for (int a : notes) {
            count += amt / a;
            amt = amt % a;
        }
        return count;
    }
}
