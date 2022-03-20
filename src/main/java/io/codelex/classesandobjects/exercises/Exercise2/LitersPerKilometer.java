package io.codelex.classesandobjects.exercises.Exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading first car: " );
        double startKilometers = scan.nextDouble();

        System.out.print("Enter first reading for second car: " );
        double startKilometersForCar1 = scan.nextDouble();

        Car firstCar = new Car(startKilometers);
        Car secondCar = new Car(startKilometersForCar1);

        firstCar.fillUp(10, 5);
        secondCar.fillUp(50, 10);
        System.out.println( "Kilometers per liter for first car are "  + firstCar.calculateConsumption());
        System.out.println( "Kilometers per liter for second car are "  + secondCar.calculateConsumption());
        firstCar.fillUp(20, 5);
        secondCar.fillUp(100, 20);
        System.out.println( "Kilometers per liter for first car are "  + firstCar.calculateConsumption());
        System.out.println( "Kilometers per liter for second car are "  + secondCar.calculateConsumption());

        System.out.println();

        if(firstCar.gasHog()) {
            System.out.println("You do not have an economic car");
        } else if (firstCar.economyCar()) {
            System.out.println("You have an economic car");
        }

        if(secondCar.gasHog()) {
            System.out.println("You do not have an economic car");
        } else if (secondCar.economyCar()) {
            System.out.println("You have an economic car");
        }
    }
}

