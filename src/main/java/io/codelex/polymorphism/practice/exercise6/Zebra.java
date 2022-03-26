package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Brurrr");
    }

    @Override
    public void eat(int quantity) {
        setFoodEaten(quantity);
    }

    @Override
    public String toString() {
        return "Zebra[" + getAnimalName() + ", " + getAnimalWeight() + ", " +
                getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
