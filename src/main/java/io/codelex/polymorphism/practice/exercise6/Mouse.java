package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeqqq");
    }

    @Override
    public void eat(int quantity) {
        setFoodEaten(quantity);
    }

    public void eatFood(String[] food) {
        if (food[0].equals("Meat")) {
            System.out.println("Mouse are not eating that type of food!");
        } else {
            setFoodEaten(Integer.parseInt(food[1]));
        }
    }

    @Override
    public String toString() {
        return "Mouse[" + getAnimalName() + ", " + getAnimalWeight() + ", " +
                getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
