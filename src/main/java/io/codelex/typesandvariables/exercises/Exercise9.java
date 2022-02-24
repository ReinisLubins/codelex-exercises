package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the distance in meters: ");
        double distInMeters = scan.nextInt();

        System.out.println("Input hours: ");
        double hours = scan.nextInt();

        System.out.println("Input minutes: ");
        double minutes = scan.nextInt();

        System.out.println("Input seconds: ");
        double seconds = scan.nextInt();

        double speedInSec = distInMeters / ((hours * 3600) + (minutes * 60) + seconds);
        double speedInKmH = (distInMeters / 1000) / (hours + (minutes / 60) + (seconds / 3600));
        double speedInMilesH = (distInMeters / 1609) / (hours + (minutes / 60) + (seconds / 3600));

        System.out.printf("Your speed in meters/second is: %.8f\n", speedInSec);
        System.out.printf("Your speed in km/h is: %.8f\n", speedInKmH);
        System.out.printf("Your speed in miles/h is: %.8f", speedInMilesH);
    }
}
