package io.codelex.advancedTest.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {

    public static <T> Double partOf(List<T> array, Predicate<T> function) {
        long matches = array.stream().filter(function).count();
        return (double) matches / array.size();
    }
}
