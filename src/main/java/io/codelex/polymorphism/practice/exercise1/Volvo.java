package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car, Boost {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 30;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Brum..Brum..");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
