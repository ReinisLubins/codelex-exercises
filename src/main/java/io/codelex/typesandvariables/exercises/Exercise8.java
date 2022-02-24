package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int inputMin = scan.nextInt();
        int min = inputMin;
        int numOfYears = 0;
        int numOfDays = 0;
        while (min > 525600)
        {
            numOfYears++;
            min -= 525600;
        }
        numOfDays = (min / 1440);

        System.out.println("Converted minutes equal to: " + numOfYears + " years and converted to days equal: " + numOfDays + " days");

    }
}
