package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise10
{
    public static void main(String[] args)
    {
        NumberSquare();
    }
    public static void NumberSquare()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int minNum = in.nextInt();
        System.out.print("Max? ");
        int maxNum = in.nextInt();

        for (int i = minNum; i < minNum + maxNum; i++)
        {
            for (int j = i; j < maxNum + i; j++)
            {
                System.out.print((j - 1) % maxNum + 1);
            }
            System.out.println();
        }
    }
}
