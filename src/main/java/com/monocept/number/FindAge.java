package com.monocept.number;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1997, 5, 8);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthday, today));
    }

}
