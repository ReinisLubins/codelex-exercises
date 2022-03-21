package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int playerWonCounter = 0;
    private static int computerWonCounter = 0;

    private static SPS computersChoice() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 0) {
            return SPS.SCISSORS;
        } else if (randomNum == 1) {
            return SPS.PAPER;
        } else {
            return SPS.STONE;
        }
    }

    private static String gameResults(String playersDecision) {
        SPS machineChoice = computersChoice();
        SPS playerChoice = null;
        switch (playersDecision) {
            case "s" -> playerChoice = SPS.SCISSORS;
            case "p" -> playerChoice = SPS.PAPER;
            case "t" -> playerChoice = SPS.STONE;
        }

        System.out.println("My turn: " + machineChoice);

        if ((playerChoice == SPS.SCISSORS && machineChoice == SPS.PAPER) ||
                (playerChoice == SPS.PAPER && machineChoice == SPS.STONE) ||
                (playerChoice == SPS.STONE && machineChoice == SPS.SCISSORS)) {
            playerWonCounter++;
            return "You won!";
        } else if (playerChoice == SPS.PAPER && machineChoice == SPS.SCISSORS) {
            computerWonCounter++;
            return "Scissor cuts paper, I won!";
        } else if (playerChoice == SPS.STONE && machineChoice == SPS.PAPER) {
            computerWonCounter++;
            return "Paper wraps stone, I won!";
        } else if (playerChoice == SPS.SCISSORS && machineChoice == SPS.STONE) {
            computerWonCounter++;
            return "Stone breaks scissor, I won!";
        } else {
            return "Tie!";
        }
    }

    private static double percentage(int counter, int wonGames) {
        return ((double) wonGames * 100 / counter);
    }


    public static void gameLogic() {
        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin...");
        boolean playAgain = true;
        int counter = 0;
        do {
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String decision = in.next();
            if (decision.equals("q")) {
                playAgain = false;
            } else if (decision.equals("s") || decision.equals("p") || decision.equals("t")) {
                System.out.println(gameResults(decision));
            } else {
                System.out.println("Invalid input, try again...");
            }
            counter++;
        } while (playAgain);
        System.out.println();
        System.out.println("Number of trials: " + counter);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).\nBye!",
                computerWonCounter, percentage(counter, computerWonCounter), playerWonCounter, percentage(counter, playerWonCounter));
    }
}
