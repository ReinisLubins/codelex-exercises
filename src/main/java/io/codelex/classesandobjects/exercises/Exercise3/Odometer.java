package io.codelex.classesandobjects.exercises.Exercise3;

public class Odometer {
    private double mileage;
    private double initialMileage;
    private final double MAX_MILEAGE = 999.999;
    private final int KM_PER_LITER = 10;
    private FuelGauge fuelGauge;

    public Odometer(double mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.initialMileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage() {
        if (mileage < MAX_MILEAGE) {
            this.mileage++;
        } else {
            mileage = 0;
        }

        double driven = mileage - initialMileage;
        if (driven % KM_PER_LITER == 0) {
            fuelGauge.burnFuel();
        }
    }
}
