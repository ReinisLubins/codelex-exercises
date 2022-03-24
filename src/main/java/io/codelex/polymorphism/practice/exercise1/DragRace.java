package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Volvo volvo = new Volvo();
        Toyota toyota = new Toyota();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();

        List<Car> dragRace = new ArrayList<>();
        dragRace.add(volvo);
        dragRace.add(toyota);
        dragRace.add(audi);
        dragRace.add(bmw);
        dragRace.add(lexus);
        dragRace.add(tesla);

        for (int i = 0; i < 5; i++) {
            dragRace.get(i).speedUp();
            if (i == 2 || i == 5 || i == 8) {
                dragRace.get(i).speedUp();
            }
        }

        Car fastestCar = null;
        int speedOfFastestCar = 0;
        for (int i = 0; i < dragRace.size(); i++) {
            int speedOfCurrentCar = Integer.parseInt(dragRace.get(i).showCurrentSpeed());
            if (speedOfCurrentCar > speedOfFastestCar) {
                fastestCar = dragRace.get(i);
            }
        }
        System.out.println(fastestCar);
    }
}
