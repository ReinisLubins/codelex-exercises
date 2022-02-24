package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstInput = scan.nextInt();

        System.out.println("Enter second integer: ");
        int secondInput = scan.nextInt();

        System.out.println("Your result: ");
        System.out.println(CheckInt(firstInput, secondInput));
    }

    public static boolean CheckInt(int x,int y)
    {
        if (x == 15 || y == 15)
        {
            return true;
        } else if (x + y == 15)
        {
            return true;
        } else if (x - y == 15 || y - x == 15)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
