package io.codelex.loops.exercises;

public class Exercise6
{
    public static void main(String[] args)
    {
        FizzBuzz(100);
    }
    public static void FizzBuzz(int inputInt)
    {
        for (int i = 0; i <= inputInt; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
            System.out.print("FizzBuzz ");
            } else if (i % 3 == 0)
            {
                System.out.print("Fizz ");
            } else if (i % 5 == 0)
            {
                System.out.print("Buzz ");
            } else
            {
                System.out.print(i + " ");
            }
            if (i % 20 == 0)
            {
                System.out.println("\n");
            }
        }
    }
}
