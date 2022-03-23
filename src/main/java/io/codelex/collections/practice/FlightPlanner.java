package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\ReinisLubins\\Desktop\\PROGRAMESANA\\JAVA SYLABUS\\codelex-exercises\\src\\main\\resources\\collections\\flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        //final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        final Path path = Paths.get(file);
        Files.readAllLines(path, charset);
        
    }
}
