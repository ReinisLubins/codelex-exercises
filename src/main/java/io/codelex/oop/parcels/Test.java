package io.codelex.oop.parcels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Input x value: ");
            int x = in.nextInt();
            System.out.print("Input y value: ");
            int y = in.nextInt();
            System.out.print("Input z value: ");
            int z = in.nextInt();
            System.out.print("Input weight value: ");
            float w = in.nextFloat();

            Parcel parcel = new Parcel(x, y, z, w);
            System.out.println("Parcel is valid: " + parcel.validate());
        } catch (InputMismatchException e) {
            System.out.println("Input numbers! " + e);
        }
    }
}
