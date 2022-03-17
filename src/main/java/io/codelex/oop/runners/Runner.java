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

    public static Runner getFitnessLevel(int timeResultInSec) {
        Runner fitnessLevel = null;
        if (timeResultInSec < ADVANCED.maxRunningTimeInSec) {
            fitnessLevel = ADVANCED;
        } else if (timeResultInSec >= INTERMEDIATE.minRunningTimeInSec && timeResultInSec < INTERMEDIATE.maxRunningTimeInSec) {
            fitnessLevel = INTERMEDIATE;
        } else if (timeResultInSec >= BEGINNER.minRunningTimeInSec && timeResultInSec < BEGINNER.maxRunningTimeInSec) {
            fitnessLevel = BEGINNER;
        }
        return fitnessLevel;
    }
}
