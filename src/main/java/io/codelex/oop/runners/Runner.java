package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(2400, 2700),
    INTERMEDIATE(1500, 2400),
    ADVANCED(900, 1500);

    private final int minRunningTimeInSec;
    private final int maxRunningTimeInSec;


    Runner(int minRunningTime, int maxRunningTime) {
        this.minRunningTimeInSec = minRunningTime;
        this.maxRunningTimeInSec = maxRunningTime;
    }

    private static boolean isBeginner(int time) {
        return time >= BEGINNER.minRunningTimeInSec
                && time < BEGINNER.maxRunningTimeInSec;
    }

    private static boolean isIntermediate(int time) {
        return time >= INTERMEDIATE.minRunningTimeInSec
                && time < INTERMEDIATE.maxRunningTimeInSec;
    }

    private static boolean isAdvanced(int time) {
        return time < ADVANCED.maxRunningTimeInSec;
    }

    public static Runner getFitnessLevel(int timeResultInSec) {
        if (isAdvanced(timeResultInSec)) {
            return ADVANCED;
        } else if (isIntermediate(timeResultInSec)) {
            return INTERMEDIATE;
        } else if (isBeginner(timeResultInSec)) {
            return BEGINNER;
        } else {
            return null;
        }
    }
}
