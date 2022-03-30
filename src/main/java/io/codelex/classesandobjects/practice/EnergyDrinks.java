package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(NUMBERED_SURVEYED, PURCHASED_ENERGY_DRINKS) + " bought at least one energy drink");
        System.out.println(calculatePreferCitrus(NUMBERED_SURVEYED, PREFER_CITRUS_DRINKS) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static int calculateEnergyDrinkers(int numberSurveyed, double energyDrinkers) {
        return (int) Math.floor(numberSurveyed * energyDrinkers);
    }

    public static int calculatePreferCitrus(int numberSurveyed, double preferCitrus) {
        return (int) Math.floor(numberSurveyed * preferCitrus);
    }
}
