package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scan.next();
        System.out.println("Enter second word: ");
        String secondWord = scan.next();

        StringBuilder dots = new StringBuilder(); // lai neaiznemtu papildus datora atminu izmanto StringBuilder
        while (firstWord.length() + secondWord.length() + dots.length() < 30)
        {
            dots.append(".");
        }
        System.out.println(firstWord + dots + secondWord);
    }
}
