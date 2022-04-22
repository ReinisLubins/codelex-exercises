package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(int quantity) {
        setFoodEaten(quantity);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat[" + getAnimalName() + ", " + getBreed() + ", " +
                getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
