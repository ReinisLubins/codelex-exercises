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
                Tiger tiger = new Tiger(inputParameters[1], "Cat",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3]);
                tiger.makeSound();
                animal = tiger;
            }
            case "Zebra" -> {
                Zebra zebra = new Zebra(inputParameters[1], "Cat",
                        Double.parseDouble(inputParameters[2]), 0,
                        inputParameters[3]);
                zebra.makeSound();
                animal = zebra;
            }
            case "Mouse" -> {
                Zebra mouse = new Zebra(inputParameters[1], "Cat",
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
            if (food[0].equals("Meat")) {
                System.out.println("Zebra are not eating that type of food!");
            } else {
                this.newAnimal.setFoodEaten(Integer.parseInt(food[1]));
            }
        } else if (this.newAnimal instanceof Mouse) {
            if (food[0].equals("Meat")) {
                System.out.println("Mouse are not eating that type of food!");
            } else {
                this.newAnimal.setFoodEaten(Integer.parseInt(food[1]));
            }
        } else if (this.newAnimal instanceof Tiger) {
            if (food[0].equals("Vegetable")) {
                System.out.println("Tiger are not eating that type of food!");
            } else {
                this.newAnimal.setFoodEaten(Integer.parseInt(food[1]));
            }
        } else {
            this.newAnimal.setFoodEaten(Integer.parseInt(food[1]));
        }
    }

    @Override
    public String toString() {
        return newAnimal + "";
    }
}
