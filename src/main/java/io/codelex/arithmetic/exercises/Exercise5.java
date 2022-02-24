package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {
        int minNumber = 1;
        int maxNumber = 100;
        Random rand = new Random();
        int randomNumber = rand.nextInt((maxNumber - minNumber) + 1) + minNumber;

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if (userInput > randomNumber)
        {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber + ".");
        } else if (userInput < randomNumber)
        {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber + ".");
        } else
        {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
