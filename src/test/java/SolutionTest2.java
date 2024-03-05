import org.example.Kata;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest2 {
    @Test @DisplayName("Sample tests")
    public void sampleTests() {
        assertEquals("a", Kata.firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", Kata.firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", Kata.firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("", Kata.firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
    }
}