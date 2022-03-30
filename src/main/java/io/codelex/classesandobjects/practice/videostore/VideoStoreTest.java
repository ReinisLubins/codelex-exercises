package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore newList = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }
            System.out.println(newList);
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            movieName += scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            newList.addVideo(movieName);
            newList.userRating(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.print("Input video you wish to rent: ");
        String videoToRent = scanner.next();
        newList.checkOutVideo(videoToRent);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.print("Input video you wish to return: ");
        String videoToReturn = scanner.next();
        newList.returnVideo(videoToReturn);
    }
}
