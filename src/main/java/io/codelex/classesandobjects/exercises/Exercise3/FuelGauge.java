package io.codelex.classesandobjects.exercises.Exercise3;

public class FuelGauge {
    private double liters;
    final static double MAX_LITERS = 70;

    public FuelGauge() { // ja masina nav nekas iepildits, tad nevar ielikt litrus
        this.liters = 0;
    }

    public FuelGauge(double liters) {
        if (liters <= MAX_LITERS) {
            this.liters = liters;
        } else {
            liters = MAX_LITERS;
        }
    }

    public double getLiters() {
        return liters;
    }

    public void addFuel() {
        if (liters < MAX_LITERS) {
            this.liters++;
        } else {
            System.out.println("Tank is full!");
        }
    }

    public void burnFuel() {
        if (liters > 0) {
            liters--;
        } else {
            System.out.println("Out of fuel!");
        }
    }
}
