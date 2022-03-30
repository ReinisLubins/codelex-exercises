package io.codelex.loops.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        asciiFigure(7);
    }

    public static void asciiFigure(int size) {
        for (int rows = 0; rows < size; rows++)
        {
            for (int leftSide = 0; leftSide < (((size - 1) * 8) / 2) - rows * 4; leftSide++) {
                System.out.print("/");
            }
            for (int stars = 0; stars < rows * 8; stars++) {
                System.out.print("*");
            }
            for (int rightSide = 0; rightSide < (((size - 1) * 8) / 2) - rows * 4; rightSide++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

