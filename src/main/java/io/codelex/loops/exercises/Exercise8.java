package io.codelex.loops.exercises;

public class Exercise8
{
    public static void main(String[] args)
    {
        AsciiFigure(7);
    }
    public static void AsciiFigure(int size)
    {
        for (int rows = 0; rows < size; rows++)
        {
            for (int leftSide = 0; leftSide < (((size - 1) * 8) / 2) - rows * 4; leftSide++)
            {
                if (rows == 0)
                {
                    System.out.print("/");
                } else
                {
                    System.out.print("/");
                }
            }
            for (int stars = 0; stars < rows * 8; stars++)
            {
                if (rows == 0)
                {
                    System.out.print("");
                } else
                {
                    System.out.print("*");
                }
            }
            for (int rightSide = 0; rightSide < (((size - 1) * 8) / 2) - rows * 4; rightSide++)
            {
                if (rows == 0)
                {
                    System.out.print("\\");
                } else
                {
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
}

