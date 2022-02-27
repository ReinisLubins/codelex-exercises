package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your charter: ");
        String inputChar = scan.next().toLowerCase();
        PhoneKeyPad(inputChar);
    }
    public static void PhoneKeyPad(String inChar)
    {
        switch (inChar) {
            case "a", "b", "c" -> System.out.println("2");
            case "d", "e", "f" -> System.out.println("3");
            case "g", "h", "i" -> System.out.println("4");
            case "j", "k", "l" -> System.out.println("5");
            case "m", "n", "o" -> System.out.println("6");
            case "p", "q", "r", "s" -> System.out.println("7");
            case "t", "u", "v" -> System.out.println("8");
            case "w", "x", "y", "z" -> System.out.println("9");
            default -> System.out.println("Invalid input");
        }
    }
}
