package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    private static final String file = "C:\\Users\\ReinisLubins\\Desktop\\PROGRAMESANA\\JAVA SYLABUS\\codelex-exercises\\src\\main\\resources\\collections\\lear.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(file));

        StringBuilder fileToString = new StringBuilder();
        StringBuilder cleanString = new StringBuilder();
        String line = bf.readLine();

        int lines = 0;
        int chars = 0;

        while (line != null) {
            chars += line.length();
            fileToString.append(line).append(" ");
            line = bf.readLine();
            lines++;
        }

        for (int i = 0; i < fileToString.length(); i++) {
            if (Character.isLetterOrDigit(fileToString.charAt(i)) || fileToString.charAt(i) == '\'') {
                cleanString.append(fileToString.charAt(i));
            } else {
                cleanString.append(" ");
            }
        }

        int words = cleanString.toString().replaceAll("\\p{javaSpaceChar}{2,}", " ").split(" ").length;

        System.out.print("Lines = " + lines + "\nWords = " + words + "\nChars = " + chars);
    }

}
