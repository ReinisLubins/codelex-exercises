package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car, Boost {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 30;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Brum..Brum..");
    }

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
