package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";
    private static final List<String> histogram = new ArrayList<>();
    private static final List<Integer> scores = new ArrayList<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        generateHashMap();
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void generateHashMap() throws URISyntaxException, IOException {
        String[] numbersSeparated = fileContent().split(" ");

        for (String s : numbersSeparated) {
            scores.add(Integer.parseInt(s));
        }

        StringBuilder eleventh = new StringBuilder();
        StringBuilder tenth = new StringBuilder();
        StringBuilder ninth = new StringBuilder();
        StringBuilder eight = new StringBuilder();
        StringBuilder seven = new StringBuilder();
        StringBuilder six = new StringBuilder();
        StringBuilder five = new StringBuilder();
        StringBuilder four = new StringBuilder();
        StringBuilder three = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder one = new StringBuilder();

        for (Integer score : scores) {
            if (score == 100) {
                eleventh.append("*");
            } else if (score < 100 && score > 89) {
                tenth.append("*");
            } else if (score < 90 && score > 79) {
                ninth.append("*");
            } else if (score < 80 && score > 69) {
                eight.append("*");
            } else if (score < 70 && score > 59) {
                seven.append("*");
            } else if (score < 60 && score > 49) {
                six.append("*");
            } else if (score < 50 && score > 39) {
                five.append("*");
            } else if (score < 40 && score > 29) {
                four.append("*");
            } else if (score < 30 && score > 19) {
                three.append("*");
            } else if (score < 20 && score > 9) {
                two.append("*");
            } else if (score < 10) {
                one.append("*");
            }
        }

        histogram.add("00-09: " + one);
        histogram.add("10-19: " + two);
        histogram.add("20-29: " + three);
        histogram.add("30-39: " + four);
        histogram.add("40-49: " + five);
        histogram.add("50-59: " + six);
        histogram.add("60-69: " + seven);
        histogram.add("70-79: " + eight);
        histogram.add("80-89: " + ninth);
        histogram.add("90-99: " + tenth);
        histogram.add("  100: " + eleventh);

        for (String s : histogram) {
            System.out.println(s);
        }
    }
}

