package io.codelex.classesandobjects.exercises.Exercise4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = {casinoRoyale, glass, spiderMan};

        System.out.println(Arrays.toString(Movie.getPG(movies)));
    }
}
