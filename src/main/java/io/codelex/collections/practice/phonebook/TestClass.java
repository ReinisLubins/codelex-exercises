package io.codelex.collections.practice.phonebook;

public class TestClass {
    public static void main(String[] args) {
        PhoneDirectory newPhoneDirectory = new PhoneDirectory();
        newPhoneDirectory.putNumber("Reinis", "+371256924");
        newPhoneDirectory.putNumber("Alfreds", "+371255693");
        newPhoneDirectory.putNumber("Beskins", "+371252593");
        newPhoneDirectory.putNumber("Peteris", "+371221513");
        newPhoneDirectory.putNumber("Andz", "+3715236293");

        System.out.println(newPhoneDirectory.getNumber("Beskins"));

        newPhoneDirectory.printDirectory();
    }
}
