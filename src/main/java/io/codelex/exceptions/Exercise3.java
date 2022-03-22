package io.codelex.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) {

        String line = null;
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File ir = new File("");
        Exercise3.cat(ir);
    }
}
