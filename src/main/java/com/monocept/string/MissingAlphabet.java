package com.monocept.string;

import java.util.Scanner;

public class MissingAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char c = 91;
        while (c-- > 65) {
            if (input.indexOf(c) < 0) {
                System.out.println(c);
            }
        }

    }
}
