package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();


        int[] myArray = new int[2];

        int sum = 0;

        for (int j : myArray) {
            sum += j;
        }
        System.out.println("The sum is " + sum);
    }
}
