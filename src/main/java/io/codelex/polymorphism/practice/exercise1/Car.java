package io.codelex.polymorphism.practice.exercise1;

public interface Car extends Boost {
    void speedUp();

    void slowDown();

    default String showCurrentSpeed() {
        return "Car is not underway!";
    }

    void startEngine();
}
