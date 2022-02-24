package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your weight in kg: ");
        double weightInKg = scan.nextDouble();

        System.out.println("Input your height in cm: ");
        double heightInCm = scan.nextDouble();

        double weightInPounds = (weightInKg * 2.20462262);
        double heightInInches = (heightInCm / 2.54);

        double bodyMassIndex = ((weightInPounds * 703) / (Math.pow(heightInInches, 2)));

        if(bodyMassIndex > 18.5 && bodyMassIndex < 25)
        {
            System.out.printf("Your BMI is %.2f, which means you have an optimal weight.", bodyMassIndex);
        } else if (bodyMassIndex < 18.5)
        {
            System.out.printf("Your BMI is %.2f, which means you are underweight.", bodyMassIndex);
        } else if (bodyMassIndex > 25)
        {
            System.out.printf("Your BMI is %.2f, which means you are overweight.", bodyMassIndex);
        }
    }
}
