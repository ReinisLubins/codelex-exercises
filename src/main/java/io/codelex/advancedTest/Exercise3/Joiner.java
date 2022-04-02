package io.codelex.advancedTest.Exercise3;

import java.util.List;
import java.util.stream.Stream;

public class Joiner<T> {
    private String inputValue;

    public Joiner(String inputValue) {
        this.inputValue = inputValue;
    }

    public String join(T... objects) {
        List<String> newList = Stream.of(objects).map(Object::toString).toList();
        return String.join(inputValue, newList);
    }
}
