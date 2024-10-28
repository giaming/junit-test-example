package tech.example.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculatorUnderTest;

    @Before
    public void setUp() {
        calculatorUnderTest = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(0, calculatorUnderTest.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, calculatorUnderTest.subtract(0, 0));
    }

    @Test
    public void testMultiple() {
        assertEquals(0, calculatorUnderTest.multiple(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(0, calculatorUnderTest.divide(0, 0));
    }

    @Test
    public void testGetResult() {
        assertEquals(0, calculatorUnderTest.getResult());
    }
}
