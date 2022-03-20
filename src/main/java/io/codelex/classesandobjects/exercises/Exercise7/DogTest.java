package io.codelex.classesandobjects.exercises.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", TheSexOfDog.MALE, "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", TheSexOfDog.MALE, "Molly", "Sam");
        Dog sparky = new Dog("Sparky", TheSexOfDog.MALE);
        Dog buster = new Dog("Buster", TheSexOfDog.MALE, "Lady", "Sparky");
        Dog sam = new Dog("Sam", TheSexOfDog.MALE);
        Dog lady = new Dog("Lady", TheSexOfDog.FEMALE);
        Dog molly = new Dog("Molly", TheSexOfDog.FEMALE);
        Dog coco = new Dog("Coco", TheSexOfDog.FEMALE, "Molly", "Buster");

        System.out.println(max);
        System.out.println(coco.getFathersName());
        System.out.println(sparky.getFathersName());

        if (coco.hasSameMotherAs(rocky)) {
            System.out.println("Coco has the same mother as Rocky");
        } else {
            System.out.println("They dont have the same mother");
        }
    }
}
