package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your day number from 0 to 6: ");
        int dayNumber = scan.nextInt();
        printDayInWord(dayNumber);
    }

    public static void printDayInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day!");
        }
    }
}
