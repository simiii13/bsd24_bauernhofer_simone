package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    //Tests for Method: add
    @Test
    void testAdd_Positive() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    void testAdd_Negative() {
        assertEquals(-2, calc.add(-1, -1));
    }

    @Test
    void testAdd_WithZero() {
        assertEquals(7, calc.add(7, 0));
    }

    //Tests for Method: subtract
    @Test
    void testSubtract_Normal() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testSubtract_Negative() {
        assertEquals(-1, calc.subtract(3, 4));
    }

    @Test
    void testSubtract_Zero() {
        assertEquals(0, calc.subtract(0,0));
    }

    //Tests for Method: multiply
    @Test
    void testMultiply_Normal() {
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    void testMultiply_WithZero() {
        assertEquals(0, calc.multiply(3, 0));
    }

    @Test
    void testMultiply_Negative() {
        assertEquals(-6, calc.multiply(2, -3));
    }

    //Tests for Method: divide
    @Test
    void testDivide_Normal() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivide_Negative() {
        assertEquals(-4, calc.divide(8, -2));
    }

    @Test
    void testDivide_ByZero() {
        assertEquals(0, calc.divide(1, 0));
    }

    //Tests for Method: factorial
    @Test
    void testFactorialOfZero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialOfThree() {
        assertEquals(6, calc.factorial(3));
    }

    @Test
    void testFactorialNegative() {
        assertEquals(0, calc.factorial(-5));    //Sonderfall
    }
}
