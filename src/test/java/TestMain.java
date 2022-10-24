// Step 2
import org.junit.Test;
import java.util.ArrayList;

import java.util.List;

import static org.junit.Assert.*;

public class TestMain {
    @Test
    public void testCodeupString(){
        assertEquals("Codeup", "Codeup"); // Test Fail
        assertNotEquals("Codeup", "CodeUp"); // Test Pass
    }

    @Test
    public void testNotSameArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        // Do these two variables refer to the same object?
        assertNotSame(languages, moreLanguages); // Test Pass
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] number = {1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(number, otherNumbers); // Test Pass
    }

    @Test
    public void testCharactersInString(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

}
