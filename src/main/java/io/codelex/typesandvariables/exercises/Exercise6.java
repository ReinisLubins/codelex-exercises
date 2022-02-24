package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt();

        int sum = 0;
        int input = number;
        while (input != 0)
        {
            int lastDigit = input % 10;
            sum += lastDigit;
            input /= 10;
        }
        // number/10 reduces one digit from number
        // and number%10 gives you last digit

        System.out.printf("Sum of digits of number %d is %d", number, sum);

        sc.close();
    }
}
