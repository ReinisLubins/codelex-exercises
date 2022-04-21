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

    public void eatFood(String[] food) {
        if (food[0].equals("Vegetable")) {
            System.out.println("Tiger are not eating that type of food!");
        } else {
            setFoodEaten(Integer.parseInt(food[1]));
        }
    }

    @Override
    public String toString() {
        return "Tiger[" + getAnimalName() + ", " + getAnimalWeight() + ", " +
                getLivingRegion() + ", " + getFoodEaten() + "]";

    }
}
