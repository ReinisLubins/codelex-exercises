package io.codelex.oop.cars;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer no1 = new Manufacturer("Tesla", 2005, "USA");
        Manufacturer no2 = new Manufacturer("Toyota", 1990, "Japan");
        Manufacturer no3 = new Manufacturer("Porsche", 1890, "France");

        List<Manufacturer> carOneManufacturers = Arrays.asList(no1, no2, no3);
        List<Manufacturer> carTwoManufacturers = Arrays.asList(no2, no3);
        List<Manufacturer> carThreeManufacturers = List.of(no3);

        Car audi = new Car("AUDI", "A4", 4512, 2005, carOneManufacturers, EngineType.V8);
        Car bmw = new Car("BMW", "X5", 2000, 1990, carTwoManufacturers, EngineType.V6);
        Car opel = new Car("OPEL", "Astra", 1000, 1990, carThreeManufacturers, EngineType.S3);
        Car jaguar = new Car("JAGUAR", "F-TYPE", 80000, 2016, carTwoManufacturers, EngineType.V12);

        CarService newCarService = new CarService();
        newCarService.addCar(audi);
        newCarService.addCar(bmw);
        newCarService.addCar(opel);
        newCarService.addCar(jaguar);

        System.out.println(newCarService + "\n");

        newCarService.removeCar(bmw);
        System.out.println(newCarService + "\n");

        System.out.println(newCarService.carsWithV12() + "\n");

        System.out.println(newCarService.carsBefore1999() + "\n");

        System.out.println(newCarService.mostExpensiveCar() + "\n");

        System.out.println(newCarService.cheapestCar() + "\n");

        System.out.println(newCarService.carWithThreeOrMoreManufacturers() + "\n");

        newCarService.ascendingCarList();
        System.out.println();

        newCarService.descendingCarList();
        System.out.println();

        System.out.println(newCarService.checkForCar("OPEL") + "\n");

        System.out.println(newCarService.specificManufacturer("Tesla") + "\n");

        System.out.println(newCarService.theSameManufacturer(2005, "="));
    }
}
