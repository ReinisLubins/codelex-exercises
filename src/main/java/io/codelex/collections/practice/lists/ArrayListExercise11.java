package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> stringList = new ArrayList<>();

        //TODO: Add 10 values to list
        stringList.add("Orange");
        stringList.add("Apple");
        stringList.add("Snow");
        stringList.add("Ice");
        stringList.add("Brown");
        stringList.add("Vodka");
        stringList.add("Juice");
        stringList.add("Monkey");
        stringList.add("Computer");
        stringList.add("Cabbage");

        //TODO: Add new value at 5th position
        stringList.add(4, "newValue");

        //TODO: Change value at last position (Calculate last position programmatically)
        stringList.set(stringList.size() - 1, "differentValue");
        System.out.println(stringList);

        //TODO: Sort your list in alphabetical order
        Collections.sort(stringList);

        //TODO: Check if your list contains "Foobar" element
        if (stringList.contains("Foobar")) {
            System.out.println("List contains Foobar!");
        } else {
            System.out.println("No Foobar in list!");
        }

        //TODO: Print each element of list using loop
        for (String element : stringList) {
            System.out.println(element);
        }
    }

}
