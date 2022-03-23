package io.codelex.practice.Exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    private static final int HOURS_OF_WORK_IN_WEEKEND = 0;
    private static final int HOURS_OF_WORK_IN_WEEKDAY = 8;

    private static boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    private static void hoursOfWork(LocalDate firstDate, LocalDate secondDate) { // logic
        int sumOfHours = 0;
        for (LocalDate date = firstDate.minusDays(1); date.isBefore(secondDate); date = date.plusDays(1)) {
            if (isWeekend(date)) {
                sumOfHours += HOURS_OF_WORK_IN_WEEKEND;
            } else {
                sumOfHours += HOURS_OF_WORK_IN_WEEKDAY;
            }
        }
        System.out.println(sumOfHours);
    }

    public static void runProgram() { // print
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year of first date: ");
        int year1 = in.nextInt();
        System.out.println("Enter month of first date: ");
        int month1 = in.nextInt();
        System.out.println("Enter day of first date: ");
        int days1 = in.nextInt();

        System.out.println();

        System.out.println("Enter year of second date: ");
        int year2 = in.nextInt();
        System.out.println("Enter month of second date: ");
        int month2 = in.nextInt();
        System.out.println("Enter day of second date: ");
        int days2 = in.nextInt();

        LocalDate firstDate = LocalDate.of(year1, month1, days1);
        LocalDate secondDate = LocalDate.of(year2, month2, days2);
        Date.hoursOfWork(firstDate, secondDate);
    }
}
