package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> wordArray = new HashSet<>();

        do {
            System.out.print("Enter name: ");
            String word = in.nextLine();

            if (word.equals("")) {
                break;
            } else {
                wordArray.add(word);
            }
        } while (true);

        System.out.println("Unique name list contains: " + wordArray);
    }
}
