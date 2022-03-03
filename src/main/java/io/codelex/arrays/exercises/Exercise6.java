package io.codelex.arrays.exercises;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber(1, 100);
        }

        int[] array2 = array1.clone();

        array1[array1.length - 1] = -7;

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    public static int randomNumber(int min, int max) {
        return (int)Math.floor(Math.random()*(max+min));
    }
}
