package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];

    public static void main(String[] args) {
        initBoard();
        gameLogic();
    }

    public static void gameLogic() {
        displayBoard();
        Scanner keyboard = new Scanner(System.in);
        boolean player1Turn = true;
        do {
            if(player1Turn) {
                System.out.println("Player1 make your move:");
                System.out.print("Enter row number (0, 1 or 2): ");
                int row = keyboard.nextInt();
                System.out.print("Enter column number (0, 1 or 2): ");
                int column = keyboard.nextInt();

                if (row > 2 && column > 2) {
                    player1Turn = validRange(keyboard, 'X');
                    displayBoard();
                } else if (board[row][column] != ' '){
                    player1Turn = onlyFreeSpaceValid(keyboard, 'X');
                    displayBoard();
                } else {
                    board[row][column] = 'X';
                    player1Turn = false;
                    displayBoard();
                }
            } else {
                System.out.println("Player2 make your move:");
                System.out.print("Enter row number (0, 1 or 2): ");
                int row = keyboard.nextInt();
                System.out.print("Enter column number (0, 1 or 2): ");
                int column = keyboard.nextInt();

                if (row > 2 && column > 2) {
                    player1Turn = validRange(keyboard, 'Y');
                    displayBoard();
                } else if (board[row][column] != ' '){
                    player1Turn = onlyFreeSpaceValid(keyboard, 'Y');
                    displayBoard();
                } else {
                    board[row][column] = 'Y';
                    player1Turn = true;
                    displayBoard();
                }
            }
        } while (!gameEnded());
        if (player1Won()) {
            System.out.println("Congratulations Player1 has won!");
        } else if (player2Won()) {
            System.out.println("Congratulations Player2 has won!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    public static boolean onlyFreeSpaceValid(Scanner keyboard, char xOrY) {
        boolean player1Turn;
        int row = 0;
        int column = 0;
        do {
            System.out.println("Please chose free space");
            System.out.print("Enter row number (0, 1 or 2): ");
            row = keyboard.nextInt();
            System.out.print("Enter column number (0, 1 or 2): ");
            column = keyboard.nextInt();
        } while (board[row][column] != ' ');

        if (row > 2 || column > 2) {
            return validRange(keyboard, xOrY);
        } else {
            board[row][column] = xOrY;
            if (xOrY == 'Y') {
                player1Turn = true;
            } else {
                player1Turn = false;
            }
            return player1Turn;
        }
    }

    public static boolean validRange(Scanner keyboard, char xOry) {
        boolean player1Turn;
        int row;
        int column;
        do {
            System.out.println("Please enter valid row and column range (0, 1 or 2)");
            System.out.print("Enter row number (0, 1 or 2): ");
            row = keyboard.nextInt();
            System.out.print("Enter column number (0, 1 or 2): ");
            column = keyboard.nextInt();
        } while (row > 2 || column > 2);

        board[row][column] = xOry;
        if(xOry == 'Y') {
            player1Turn = true;
        } else {
            player1Turn = false;
        }
        return player1Turn;
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean boardIsFull() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean player1Won() {
        boolean player1HasWon;
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            player1HasWon = true;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            player1HasWon = true;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            player1HasWon = true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            player1HasWon = true;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            player1HasWon = true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            player1HasWon = true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            player1HasWon = true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            player1HasWon = true;
        } else {
            player1HasWon = false;
        }
        return player1HasWon;
    }

    public static boolean player2Won() {
        boolean player2HasWon;
        if (board[0][0] == 'Y' && board[0][1] == 'Y' && board[0][2] == 'Y') {
            player2HasWon = true;
        } else if (board[1][0] == 'Y' && board[1][1] == 'Y' && board[1][2] == 'Y') {
            player2HasWon = true;
        } else if (board[2][0] == 'Y' && board[2][1] == 'Y' && board[2][2] == 'Y') {
            player2HasWon = true;
        } else if (board[0][0] == 'Y' && board[1][0] == 'Y' && board[2][0] == 'Y') {
            player2HasWon = true;
        } else if (board[0][1] == 'Y' && board[1][1] == 'Y' && board[2][1] == 'Y') {
            player2HasWon = true;
        } else if (board[0][2] == 'Y' && board[1][2] == 'Y' && board[2][2] == 'Y') {
            player2HasWon = true;
        } else if (board[0][0] == 'Y' && board[1][1] == 'Y' && board[2][2] == 'Y') {
            player2HasWon = true;
        } else if (board[0][2] == 'Y' && board[1][1] == 'Y' && board[2][0] == 'Y') {
            player2HasWon = true;
        } else {
            player2HasWon = false;
        }
        return player2HasWon;
    }

    public static boolean gameEnded() {
        boolean finished;
        if (player1Won() || player2Won() || boardIsFull()) {
            finished = true;
        } else {
            finished = false;
        }
        return finished;
    }
}