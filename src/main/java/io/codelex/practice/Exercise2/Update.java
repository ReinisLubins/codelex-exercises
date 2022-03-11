package io.codelex.practice.Exercise2;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Update {

    public static void dayToUpdate(LocalDate launchDate, int yearToUpdate, int monthToUpdate) { // logic
        LocalDate inputDate = LocalDate.of(yearToUpdate, monthToUpdate, 1);
        LocalDate dateOfUpdates = inputDate.with(TemporalAdjusters.lastDayOfMonth());

        for (LocalDate date = launchDate.minusDays(1); date.isBefore(dateOfUpdates); date = date.plusDays(14)) {
            if (date.getYear() == yearToUpdate && date.getMonthValue() == monthToUpdate) {
                System.out.println("Date of update is: " + date);
            }
        }
    }

    public static void runProgram() { // print
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year of server launch: ");
        int year = in.nextInt();
        System.out.println("Enter month of server launch: ");
        int month = in.nextInt();
        System.out.println("Enter day of server launch: ");
        int day = in.nextInt();
        LocalDate launchDate = LocalDate.of(year, month, day);

        System.out.println();

        System.out.println("Enter year of update: ");
        int yearOfUpdate = in.nextInt();
        System.out.println("Enter month of update: ");
        int monthOfUpdate = in.nextInt();

        dayToUpdate(launchDate, yearOfUpdate, monthOfUpdate);
    }
}
