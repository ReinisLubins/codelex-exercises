package io.codelex.collections.practice.Flight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    private static final String file = "C:\\Users\\ReinisLubins\\Desktop\\PROGRAMESANA\\JAVA SYLABUS\\codelex-exercises\\src\\main\\resources\\collections\\flights.txt";
    private static final List<String> flights = new ArrayList<>();
    private static final Map<Integer, String> allCities = new HashMap<>();
    private static final Map<Integer, String> listOfAvailableFlights = new HashMap<>();
    private static final List<String> chosenRoute = new ArrayList<>();

    public static void updateListOfAllCities() throws IOException {
        fileRead();
        listOfAllCities();

        Scanner input = new Scanner(System.in);
        boolean firstCityPicked = false;
        boolean startingCityEqualsNextCity = false;
        int keyForRequestedCity = 0;
        String startingCity = "";
        String nextCity = "";


        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press 3");
        int userInput = input.nextInt();
        if (userInput == 3) {
            System.out.println("Thank you for using this program!");
        } else {
            do {
                System.out.print("List of available flights: ");
                System.out.print(allCities + "\n");
                System.out.print("Select a city from which you would like to start: ");

                int selectFlightFrom = input.nextInt();

                if (allCities.containsKey(selectFlightFrom)) {
                    startingCity = allCities.get(selectFlightFrom);
                    chosenRoute.add(startingCity);
                    keyForRequestedCity = selectFlightFrom;
                    firstCityPicked = true;
                } else {
                    System.out.println("Please enter correct value");
                }
            } while (!firstCityPicked);

            do {
                listOfAvailableFlights.clear();
                availableFlights(keyForRequestedCity);

                System.out.println("Available flights: " + listOfAvailableFlights);
                System.out.print("Select next city: ");
                int nextCityPicked = input.nextInt();

                if (listOfAvailableFlights.containsKey(nextCityPicked)) {
                    nextCity = listOfAvailableFlights.get(nextCityPicked);
                    chosenRoute.add(nextCity);
                    for (int i = 1; i <= allCities.size(); i++) {
                        if (nextCity.equals(allCities.get(i))) {
                            keyForRequestedCity = i;
                        }
                    }

                    if (startingCity.equals(nextCity)) {
                        startingCityEqualsNextCity = true;
                    }
                } else {
                    System.out.println("Please enter correct value");
                }
            } while (!startingCityEqualsNextCity);
        }
        printChoseRoute();
    }

    private static void fileRead() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String lines = bf.readLine();

        while (lines != null) {
            flights.add(lines);
            lines = bf.readLine();
        }
    }

    private static String flightFrom(int index) {
        String[] flightInfo = flights.get(index).replaceAll(" ", "").split("->");
        return flightInfo[0];
    }

    private static String flightTo(int index) {
        String[] flightInfo = flights.get(index).replaceAll(" ", "").split("->");
        return flightInfo[1];
    }

    private static void listOfAllCities() {
        int indexForKey = 1;
        for (int i = 0; i < flights.size(); i++) {
            if (!allCities.containsValue(flightFrom(i))) {
                allCities.put(indexForKey, flightFrom(i));
                indexForKey++;
            }
        }
    }

    private static void availableFlights(int objectKey) {
        String departureCity = allCities.get(objectKey);
        int indexForFlights = 1;

        for (int i = 0; i < flights.size(); i++) {
            if (departureCity.equals(flightFrom(i))) {
                listOfAvailableFlights.put(indexForFlights, flightTo(i));
                indexForFlights++;
            }
        }
    }

    private static void printChoseRoute() {
        System.out.println("Your chosen route:");
        for (int i = 0; i < chosenRoute.size(); i++) {
            if ((i == chosenRoute.size() - 1)) {
                System.out.print(chosenRoute.get(i));
            } else {
                System.out.print(chosenRoute.get(i) + "->");
            }
        }
    }
}
