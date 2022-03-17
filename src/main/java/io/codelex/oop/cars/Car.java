package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturers;
    private EngineType typeOfEngine;

    public Car(String name, String model, BigDecimal price, int yearOfManufacture, List<Manufacturer> manufacturers, EngineType typeOfEngine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.typeOfEngine = typeOfEngine;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public EngineType getTypeOfEngine() {
        return typeOfEngine;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture
                && name.equals(car.name) && model.equals(car.model)
                && manufacturers.equals(car.manufacturers)
                && typeOfEngine == car.typeOfEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers, typeOfEngine);
    }

    @Override
    public int compareTo(Car o) {
        return name.compareTo(o.name);
    }
}
