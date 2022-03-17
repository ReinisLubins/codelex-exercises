package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCar(Car carName) {
        carList.add(carName);
    }

    public void removeCar(Car carName) {
        carList.remove(carName);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carList=" + carList +
                '}';
    }

    public void carsWithV12() {
        for (Car car : carList) {
            if (car.getTypeOfEngine() == EngineType.V12) {
                System.out.println(car);
            } else {
                System.out.println("There is no cars with V12 engines!");
            }
        }
    }

    public void carsBefore1999() {
        for (Car car : carList) {
            if (car.getYearOfManufacture() < 1999) {
                System.out.println(car);
            } else {
                System.out.println("There is no cars manufactured before 1999!");
            }
        }
    }

    public Car mostExpensiveCar() {
        BigDecimal mostExpensive = new BigDecimal(0);
        Car expensiveCar = null;
        for (Car car : carList) {
            if (car.getPrice().compareTo(mostExpensive) > 0) {
                mostExpensive = car.getPrice();
                expensiveCar = car;
            }
        }
        return expensiveCar;
    }

    public Car cheapestCar() {
        BigDecimal cheapest = new BigDecimal(0);
        Car theCheapestCar = null;
        for (int i = 0; i < carList.size(); i++) {
            if (i == 0) {
                cheapest = carList.get(i).getPrice();
                theCheapestCar = carList.get(i);
            } else if (carList.get(i).getPrice().compareTo(cheapest) < 0) {
                cheapest = carList.get(i).getPrice();
                theCheapestCar = carList.get(i);
            }
        }
        return theCheapestCar;
    }

    public void carWithManufacturers() {
        for (Car car : carList) {
            if (car.getManufacturers().size() >= 3) {
                System.out.println(car);
            }
        }
    }

    public void ascendingCarList() {
        Collections.sort(carList);
        System.out.println(carList);
    }

    public void descendingCarList() {
        Collections.sort(carList);
        for (int i = carList.size(); i > 0; i--) {
            System.out.println(carList.get(i - 1));
        }
    }

    public boolean checkForCar(String nameOfCar) {
        boolean carIsOnTheList = false;
        for (Car car : carList) {
            if (car.getName().equals(nameOfCar)) {
                carIsOnTheList = true;
                break;
            }
        }
        return carIsOnTheList;
    }

    public List<Car> specificManufacturer(String nameOfManufacturer) {
        List<Car> carsWithSameManufacturer = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                if (manufacturer.getName().equals(nameOfManufacturer)) {
                    carsWithSameManufacturer.add(car);
                }
            }
        }
        return carsWithSameManufacturer;
    }
}

