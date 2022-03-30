package io.codelex.StudyExercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    // beforeEach - pirms katra testa izpildas, afterEach, BeforeAll ...

    @Test
    void testToString() {
        //GIVEN
        Author author = new Author("Reinis", "Lubins");
        String expected = "Author{name='Reinis', lastname='Lubins'}";

        //WHEN
        String actualResult = author.toString();

        //THEN
        Assertions.assertEquals(expected, actualResult);
    }



    /*@BeforeAll
    static void printOutStart() {
        System.out.println("Testing has started!");
    }

    @Test
    @DisplayName("Here i tested something else")
    void testToString() {
        throw new RuntimeException("Error");
    }

    @Test
    void metode2() {

    }

    @Test
    void metode3() {

    }

    @Test
    void metode4() {

    }*/

}
