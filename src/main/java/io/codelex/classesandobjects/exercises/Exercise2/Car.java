package io.codelex.classesandobjects.exercises.Exercise2;

public class Car {
    private double startKilometers;
    private double liters;
    private double mileage;
    private final int FUEL_CONSUMPTION_HOG = 15;
    private final int FUEL_CONSUMPTION_ECONOMY = 5;

    public Car(double startOdo) {
        startKilometers = startOdo;
    }

    public double calculateConsumption() {
        return liters / (mileage - startKilometers) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > FUEL_CONSUMPTION_HOG;
    }

    public boolean economyCar() {
        return calculateConsumption() < FUEL_CONSUMPTION_ECONOMY;
    }

    void fillUp(double mileage, double liters) {
        this.startKilometers = this.mileage;
        this.mileage = mileage;
        this.liters = liters;
    }
}
