package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Piglet();
    }

    public static int rollTheDice() {
        return (int)Math.floor((Math.random()*6)+1); // 6 - diceMaxRange; 1 - diceMinRange
    }

    public static void Piglet() {
        int pointGathered = 0;
        int rollFirstTime = rollTheDice();
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        System.out.println("You rolled a " + rollFirstTime + "!");
        pointGathered += rollFirstTime;
        if (pointGathered != 1) {
            do {
                System.out.println("Roll again?");
                String rollAgain = input.next();

                if (rollAgain.equals("yes")) {
                    int rollOnceMore = rollTheDice();
                    if (rollOnceMore != 1) {
                        System.out.println("You rolled a " + rollOnceMore + "!");
                        pointGathered += rollOnceMore;
                    } else {
                        System.out.println("You rolled a " + rollOnceMore + "!");
                        System.out.println("You got 0 points!");
                        gameOver = true;
                    }
                } else if (rollAgain.equals("no")) {
                    System.out.println("You got " + pointGathered + " points.");
                    gameOver = true;
                }
            } while (!gameOver);
        } else {
            System.out.println("You got 0 points!");
        }
    }
}

