package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String companyAndModel;

    public Computer(String processor, String ram, String graphicsCard, String companyAndModel) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.companyAndModel = companyAndModel;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompanyAndModel() {
        return companyAndModel;
    }

    public void setCompanyAndModel(String companyAndModel) {
        this.companyAndModel = companyAndModel;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", companyAndModel='" + companyAndModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return processor.equals(computer.processor) && ram.equals(computer.ram) && graphicsCard.equals(computer.graphicsCard) && companyAndModel.equals(computer.companyAndModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, companyAndModel);
    }
}
