package io.codelex.enums.practice.Exercise2;

import java.util.Random;

public enum SPS {
    SCISSORS,
    PAPER,
    STONE;

    public static SPS computersChoice() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        SPS randomSPSValue = null;
        for (SPS element : SPS.values()) {
            if (element.ordinal() == randomNum) {
                randomSPSValue = element;
            }
        }
        return randomSPSValue;
    }
}
