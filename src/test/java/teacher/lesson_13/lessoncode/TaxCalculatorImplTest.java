package teacher.lesson_13.lessoncode;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TaxCalculatorImplTest {

    private TaxCalculator calculator;

    @Before
    public void initialize() {
        calculator = new TaxCalculatorImpl();
    }

    @Test
    public void shouldReturn25PercentTax_When1000IncomeGiven() {
        double realTaxResult = calculator.calculate25PercentTax(1000.0);
        assertEquals(250.0, realTaxResult);
    }

    @Test
    public void shouldReturnZeroTax_WhenZeroIncomeGiven() {
        double realTaxResult = calculator.calculate25PercentTax(0.0);
        assertEquals(0.0, realTaxResult);
    }
}