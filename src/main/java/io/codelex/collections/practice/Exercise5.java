package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int result = in.nextInt();
        int count = 0;
        boolean isHappy = false;
        List<Integer> numbersTillResult = new ArrayList<>();

        do {
            int newNum = result;
            int calcBlock = 0;
            do {
                calcBlock += Math.pow((newNum % 10), 2);
                newNum /= 10;
            } while (newNum != 0);
            result = calcBlock;
            numbersTillResult.add(result);
            count++;
            if (count > 10 || result == 1) {
                isHappy = true;
            }
        } while (!isHappy);

        if (count > 10) {
            System.out.println("Not Happy!");
        } else {
            System.out.println("Happy! Numbers calculated: " + numbersTillResult);
        }
    }
}
