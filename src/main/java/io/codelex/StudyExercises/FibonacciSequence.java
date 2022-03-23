package io.codelex.StudyExercises;

public class FibonacciSequence {

    public int getNumber(int index) {
        if (index < 1) {
            throw new IllegalArgumentException();
        } else if (index <= 2) {
            return index - 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
    }

   /* private int getFibonacciNumber(int index) {
        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
        }
    }*/
}
