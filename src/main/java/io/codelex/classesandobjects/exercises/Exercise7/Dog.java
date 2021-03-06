package io.codelex.classesandobjects.exercises.Exercise7;

public class Dog {
    private String name;
    private TheSexOfDog sex;
    private String mothersName;
    private String fathersName;

    public Dog(String name, TheSexOfDog sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mothersName = mother;
        this.fathersName = father;
    }

    public Dog(String name, TheSexOfDog sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name ='" + name + '\'' +
                ", sex = '" + sex + '\'' +
                ", mothersName = '" + getMothersName() + '\'' +
                ", fathersName = '" + getFathersName() + '\'' +
                '}';
    }

    public String getFathersName() {
        if (fathersName == null) {
            return "Unknown";
        }
        return fathersName;
    }

    public String getMothersName() {
        if (mothersName == null) {
            return "Unknown";
        }
        return mothersName;
    }

    public boolean hasSameMotherAs(Dog secondDog) {
        return mothersName.equals(secondDog.mothersName);
    }
}
