package io.codelex.arithmetic.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ROOT); // izmanto so funkciju, lai varetu console likt punktu nevis komatu
        System.out.println("Enter employees base pay: ");
        double basePay = scan.nextDouble();
        System.out.println("Enter employees worked hours: ");
        double hoursWorked = scan.nextDouble();

        double wage = (hoursWorked * basePay);
        double wageWithOvertime = ((hoursWorked * basePay) + ((hoursWorked - 40) * (basePay * 1.5)));

        if (basePay < 8.0)
        {
            System.out.println("The base pay must not be less than the minimum wage!");
        } else if (hoursWorked > 60.0)
        {
            System.out.println("Number of work hours is greater than 60!");
        } else if (hoursWorked > 40.0)
        {
            System.out.printf("Employees wage is: %.2f$", wageWithOvertime);
        } else
        {
            System.out.printf("Employees wage is: %.2f$", wage);
        }
    }
}
