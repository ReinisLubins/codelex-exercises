package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your number: ");
        int inputNum = scan.nextInt();

        System.out.println("Your number is: ");

        if (inputNum % 2 == 0)
        {
            System.out.println("Even Number");
        } else
        {
            System.out.println("Odd Number");
        }

        System.out.println("bye!");
        scan.close();
    }
}
