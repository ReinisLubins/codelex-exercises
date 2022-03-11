package io.codelex.practice.Exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate first = LocalDate.of(2022, 3, 5);
        LocalDate second = LocalDate.of(2022, 3, 9);
        DatePeriod firstPeriod = new DatePeriod(first, second);
    }
}
