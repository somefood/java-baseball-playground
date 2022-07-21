import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void calcTest() {
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");
        int result = calculator.calc(values);
        assertEquals(10, result);
    }
}