package io.codelex.enums.practice.Exercise1;

public class Test {
    public static void main(String[] args) {

        CardinalPoints direction = CardinalPoints.NORTH;

        switch (direction) {
            case NORTH -> System.out.println("up");
            case SOUTH -> System.out.println("down");
            case EAST -> System.out.println("right");
            case WEST -> System.out.println("left");
        }

        for (int i = 0; i < CardinalPoints.values().length; i++) {
            switch (CardinalPoints.values()[i]) {
                case NORTH -> System.out.println("North:up:" + CardinalPoints.valueOf("NORTH").ordinal());
                case SOUTH -> System.out.println("South:down:" + CardinalPoints.valueOf("SOUTH").ordinal());
                case EAST -> System.out.println("East:right:" + CardinalPoints.valueOf("EAST").ordinal());
                case WEST -> System.out.println("West:left:" + CardinalPoints.valueOf("WEST").ordinal());
            }
        }
    }
}
