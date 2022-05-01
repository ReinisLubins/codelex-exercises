package io.codelex.advancedTest.Exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContentReader {

    public static String readFile(File inputFile) throws FileNotFoundException {
        Scanner in = new Scanner(inputFile);
        StringBuilder fileInString = new StringBuilder();
        while (in.hasNextLine()) {
            fileInString.append(in.nextLine());
            fileInString.append(" ");
        }
        return fileInString.reverse().toString();
    }
}
