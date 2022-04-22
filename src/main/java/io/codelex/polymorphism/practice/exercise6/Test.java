package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<GetAnimal> animalList = new ArrayList<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            String animalParameters = in.nextLine();
            String[] inputParameters = animalParameters.split(" ");
            GetAnimal animal = new GetAnimal();
            if (inputParameters[0].equals("End")) {
                break;
            } else {
                animal.inputAnimal(inputParameters);
            }

            String foodToEat = in.nextLine();
            String[] food = foodToEat.split(" ");
            if (food[0].equals("End")) {
                break;
            } else {
                animal.setFoodToAnimal(food);
            }
            System.out.println(animal);
            animalList.add(animal);
        }

        for (GetAnimal oneAnimal : animalList) {
            System.out.println(oneAnimal);
        }
    }
}
