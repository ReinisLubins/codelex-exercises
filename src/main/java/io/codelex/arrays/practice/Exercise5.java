package io.codelex.arrays.practice;

public class Exercise5 {

    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement36 = 0;
        int indexOfElement29 = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (36 == myArray[i]) {
                indexOfElement36 = i;
            } else if (29 == myArray[i]) {
                indexOfElement29 = i;
            }
        }

        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8

        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);

    }
}
