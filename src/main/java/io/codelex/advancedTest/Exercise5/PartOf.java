package io.codelex.advancedTest.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {

    public static <T> Integer partOf(List<T> array, Predicate function) {
        long matches = array.stream().filter(function).count();
        return null;
    }
}
