package kata.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void shouldReturnZeroWhenEmpty() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void shouldReturnTheSameNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    void shouldAddManyNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(30, calculator.add("3,4,20,1,2"));
    }

    @Test
    void shouldAddWithLongCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(30, calculator.add("//::\n3::4::20::1::2"));
    }
}
