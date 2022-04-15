package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.getOrDefault(name, "There no person whit such a name!");
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
        newEntry.setName(name);
        newEntry.setNumber(number);
        data.put(name, number);   // Add the new pair to the array.
    }

    public void printDirectory() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("%s : %s\n", key, value);
        }
    }
}


