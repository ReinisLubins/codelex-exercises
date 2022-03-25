package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 15;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Bzzz...");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
