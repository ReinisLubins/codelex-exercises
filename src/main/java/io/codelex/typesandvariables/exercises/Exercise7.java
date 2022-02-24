package io.codelex.typesandvariables.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise7
{
    public static void main(String[] args)
    {
        String regEx = "[A-Z]+";
        Scanner scan = new Scanner(System.in);
        String inputText = scan.next();
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputText);
        int count = 0;
        while (matcher.find()) {
            count+=matcher.group(0).length();
        }
        System.out.printf("Found %d, of capital letters in %s%n", count, inputText);
    }
}
