package tests;

//import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextTests {

    @Test
    public void FirstTest() {
        String langEn =  "Welcome";
        String langDutch = "Welkom";
        System.out.println("firsttest gerund.");

        Assertions.assertEquals(langDutch,langDutch);

        Assertions.assertNotEquals(langEn,langDutch);

    }
}
