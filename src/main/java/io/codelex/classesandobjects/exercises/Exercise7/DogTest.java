package io.codelex.classesandobjects.exercises.Exercise7;

import static io.codelex.classesandobjects.exercises.Exercise7.Dog.hasSameMotherAs;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        System.out.println(max);
        System.out.println(coco.getFathersName());
        System.out.println(sparky.getFathersName());

        if (hasSameMotherAs(coco, rocky)) {
            System.out.println("Coco has the same mother as Rocky");
        } else {
            System.out.println("They dont have the same mother");
        }
    }
}
