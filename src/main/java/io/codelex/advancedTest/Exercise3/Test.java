package io.codelex.advancedTest.Exercise3;

public class Test {
    public static void main(String[] args) {
        Joiner joiner = new Joiner<>("=");
        String result = joiner.join(1, 2, 3, "es", 4, 5);
        System.out.println(result);
    }
}
