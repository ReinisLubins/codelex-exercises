package io.codelex.practice.Exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {

    public static void hoursOfWork(LocalDate firstDate, LocalDate secondDate) {
        int sumOfHours = 0;
        for (LocalDate date = firstDate.minusDays(1); date.isBefore(secondDate); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sumOfHours += 0;
            } else {
                sumOfHours += 8;
            }
        }
        System.out.println(sumOfHours);
    }

    public static void runProgram() {
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
