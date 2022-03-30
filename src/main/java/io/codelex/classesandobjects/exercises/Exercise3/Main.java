package io.codelex.classesandobjects.exercises.Exercise3;

public class Main {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(10);
        Odometer odometer = new Odometer(0, fuelGauge);

        System.out.println(fuelGauge.getLiters());
        System.out.println(odometer.getMileage());

        for (double i = fuelGauge.getLiters(); i < FuelGauge.MAX_LITERS; i++) {
            fuelGauge.addFuel();
        }

        System.out.println(fuelGauge.getLiters() + "\n");

        while (fuelGauge.getLiters() > 0) {
            odometer.addMileage();
            System.out.print("Fuel: " + fuelGauge.getLiters() + " Mileage: ");
            System.out.print(odometer.getMileage() + "\n");
        }
    }
}
