package io.codelex.classesandobjects.exercises.Exercise2;

public class Car {
    private double startKilometers;
    private double liters;
    private double mileage;

    public Car(double startOdo) {
        startKilometers = startOdo;
    }

    public double calculateConsumption() {
        return liters / (mileage - startKilometers) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    void fillUp(double mileage, double liters) {
        this.startKilometers = this.mileage;
        this.mileage = mileage;
        this.liters = liters;
    }
}
