package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        rollTwoDice();
    }

    public static void rollTwoDice() {
        boolean victory = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Desired sum: ");
        int userInValue = in.nextInt();

        do {
            int firstDice = rollTheDice(1, 6);
            int secondDice = rollTheDice(1, 6);
            int sumOfTwoDice = firstDice + secondDice;
            System.out.println(firstDice + " and " + secondDice + " = " + sumOfTwoDice);
            if (userInValue == sumOfTwoDice) {
                victory = true;
            }
        } while (!victory);
    }

    public static int rollTheDice(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
