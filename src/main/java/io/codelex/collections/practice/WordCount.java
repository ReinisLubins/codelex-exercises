package io.codelex.collections.practice;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\ReinisLubins\\Desktop\\PROGRAMESANA\\JAVA SYLABUS\\codelex-exercises\\src\\main\\resources\\collections\\lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        File fileToRead = new File(file);
        Scanner scan = new Scanner(fileToRead);

        long lines = 0;
        long words = 0;
        long chars = 0;

        while (scan.hasNextLine()) {
            scan.nextLine();
            lines++;
        }

        while (scan.hasNext()) {
            scan.next();
            words++;
        }


        System.out.println(lines + " " + words + " " + chars);
    }

}
