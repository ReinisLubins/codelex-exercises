package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private String batteryParameter;

    public Laptop(String processor, String ram, String graphicsCard, String companyAndModel, String batteryParameter) {
        super(processor, ram, graphicsCard, companyAndModel);
        this.batteryParameter = batteryParameter;
    }

    public String getBatteryParameter() {
        return batteryParameter;
    }

    public void setBatteryParameter(String batteryParameter) {
        this.batteryParameter = batteryParameter;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + getProcessor() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", companyAndModel='" + getCompanyAndModel() + '\'' +
                "batteryParameter='" + batteryParameter + '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return getProcessor().equals(laptop.getProcessor()) && getRam().equals(laptop.getRam()) && getGraphicsCard().equals(laptop.getGraphicsCard())
                && getCompanyAndModel().equals(laptop.getCompanyAndModel()) && batteryParameter.equals(laptop.batteryParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryParameter);
    }
}
