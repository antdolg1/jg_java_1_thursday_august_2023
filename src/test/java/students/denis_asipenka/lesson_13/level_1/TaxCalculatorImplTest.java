package students.denis_asipenka.lesson_13.level_1;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class TaxCalculatorImplTest {
    private TaxCalculator calculator;

    @Before
    public void initialize() {
        calculator = new TaxCalculatorImpl();
    }

    @Test
    public void calculateTaxWhenZeroIncome() {
        BigDecimal income = BigDecimal.ZERO;
        income = calculator.calculateTax(income);
        assertEquals(income, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        BigDecimal income = new BigDecimal("10000");
        income = calculator.calculateTax(income);
        assertEquals(income, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        BigDecimal income = new BigDecimal("20000");
        income = calculator.calculateTax(income);
        assertEquals(income, new BigDecimal("5000.00"));
    }

    @Test
    public void mustPay25PercentTaxOnIncomeLessThan20000And40PercentOnIncomeAbove20000() {
        BigDecimal income = new BigDecimal("30000");
        income = calculator.calculateTax(income);
        assertEquals(income, new BigDecimal("9000.00"));
    }

    @Test
    public void mustPay25PercentTaxOnIncomeLessThan20000And40PercentOnIncomeAbove20000_V1() {
        BigDecimal income = new BigDecimal("21000");
        income = calculator.calculateTax(income);
        assertEquals(income, new BigDecimal("5400.00"));
    }
}