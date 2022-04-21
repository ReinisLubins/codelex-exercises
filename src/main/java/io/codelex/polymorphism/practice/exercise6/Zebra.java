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

    public void eatFood(String[] food) {
        if (food[0].equals("Meat")) {
            System.out.println("Zebra are not eating that type of food!");
        } else {
            setFoodEaten(Integer.parseInt(food[1]));
        }
    }

    @Override
    public String toString() {
        return "Zebra[" + getAnimalName() + ", " + getAnimalWeight() + ", " +
                getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
