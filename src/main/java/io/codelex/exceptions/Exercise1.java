package io.codelex.exceptions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            try {
                System.out.println("Enter the numerator");
                String numeratorString = scanner.next();
                if (numeratorString.charAt(0) == 'q' || numeratorString.charAt(0) == 'Q') {
                    break;
                } else {
                    int numerator = Integer.parseInt(numeratorString);
                    num = numerator;
                    System.out.println("Enter the divisor");
                    int divisor = scanner.nextInt();
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                }
            } catch (ArithmeticException e) {
                System.out.printf("You can't divide %d by 0\n", num);
            } catch (Exception e) {
                System.out.println("You entered bad data.\n" + "Please try again.");
                scanner.nextLine();
            }
        }
    }
}
