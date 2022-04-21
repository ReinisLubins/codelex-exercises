package io.codelex.polymorphism.practice.exercise6;

public class GetAnimal {
    private Animal newAnimal;

    public void inputAnimal(String[] inputParameters) {
        Animal animal = null;
        switch (inputParameters[0]) {
            case "Cat" -> {
                Cat cat = new Cat(inputParameters[1], "Cat",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3], inputParameters[4]);
                cat.makeSound();
                animal = cat;
            }
            case "Tiger" -> {
                Tiger tiger = new Tiger(inputParameters[1], "Tiger",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3]);
                tiger.makeSound();
                animal = tiger;
            }
            case "Zebra" -> {
                Zebra zebra = new Zebra(inputParameters[1], "Zebra",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3]);
                zebra.makeSound();
                animal = zebra;
            }
            case "Mouse" -> {
                Mouse mouse = new Mouse(inputParameters[1], "Mouse",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3]);
                mouse.makeSound();
                animal = mouse;
            }
        }
        this.newAnimal = animal;
    }

    public void setFoodToAnimal(String[] food) {
        if (this.newAnimal instanceof Zebra) {
            ((Zebra) this.newAnimal).eatFood(food);
        } else if (this.newAnimal instanceof Mouse) {
            ((Mouse) this.newAnimal).eatFood(food);
        } else if (this.newAnimal instanceof Tiger) {
            ((Tiger) this.newAnimal).eatFood(food);
        } else {
            this.newAnimal.setFoodEaten(Integer.parseInt(food[1]));
        }
    }

    @Override
    public String toString() {
        return newAnimal + "";
    }
}
