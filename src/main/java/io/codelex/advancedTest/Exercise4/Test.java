package io.codelex.advancedTest.Exercise4;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ReinisLubins\\Desktop\\PROGRAMESANA\\JAVA SYLABUS" +
                "\\codelex-exercises\\src\\main\\java\\io\\codelex\\advancedTest\\Exercise4\\SomeText");
        System.out.println(ContentReader.readFile(file));
    }
}
