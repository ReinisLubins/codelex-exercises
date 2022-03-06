package io.codelex.classesandobjects.exercises.Exercise4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] moviePG) {
        Movie[] pgMovies = new Movie[moviePG.length];

        int indexForPgMovies = 0;
        for (int i = 0; i < moviePG.length; i++) {
            if (moviePG[i].rating.equals("PG")) {
                pgMovies[indexForPgMovies] = moviePG[i];
                indexForPgMovies++;
            }
        }
        return pgMovies;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "title = '" + title + '\'' +
                ", studio = '" + studio + '\'' +
                ", rating = '" + rating + '\'' +
                '}';
    }
}
