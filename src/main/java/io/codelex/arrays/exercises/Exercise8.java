package io.codelex.arrays.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        hangmanGame();
    }

    private static void hangmanGame() {
        String[] listOfWords = {"airplane", "car", "computer", "window", "apple", "bicycle", "programming", "software", "mouse", "keyboard"};

        Random rand = new Random();
        int randomWordIndex = rand.nextInt(listOfWords.length);
        String chosenRandomWord = listOfWords[randomWordIndex];
        char[] wordArrOfChars = chosenRandomWord.toCharArray();
        int limitedTries = 3;

        StringBuilder word = new StringBuilder();
        StringBuilder missesChar = new StringBuilder();
        StringBuilder guessChar = new StringBuilder();

        word.append("_".repeat(chosenRandomWord.length()));

        Scanner in = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word:   " + word + "\n");
        System.out.print("Misses: " + missesChar + "\n");
        System.out.print("Guess:  " + guessChar + "\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        while (!word.toString().equals(chosenRandomWord)) {
            System.out.print("Please enter your guess character: ");
            char guess = in.next().toLowerCase().charAt(0);
            if (new String(wordArrOfChars).contains("" + guess)) {
                for (int i = 0; i < wordArrOfChars.length; i++) {
                    if (wordArrOfChars[i] == guess) {
                        word.setCharAt(i, wordArrOfChars[i]);
                    }
                }
                guessChar.append(guess);
            } else {
                missesChar.append(guess);
                limitedTries--;
                if (limitedTries == 0) {
                    break;
                }
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word:   " + word + "\n");
            System.out.print("Misses: " + missesChar + "\n");
            System.out.print("Guess:  " + guessChar + "\n");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        if (word.toString().equals(chosenRandomWord)) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("YOU LOST!");
        }
        playAgain();
    }

    public static void playAgain() {
        Scanner in = new Scanner(System.in);
        System.out.println("Play again or quit?");
        String againOrQuit = in.next().toLowerCase();
        if (againOrQuit.equals("again")) {
            hangmanGame();
        } else {
            System.out.println("Thank you for playing");
        }
    }
}
