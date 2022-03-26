package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(int quantity) {
        setFoodEaten(quantity);
    }

    @Override
    public String toString() {
        return "Tiger[" + getAnimalName() + ", " + getAnimalWeight() + ", " +
                getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
