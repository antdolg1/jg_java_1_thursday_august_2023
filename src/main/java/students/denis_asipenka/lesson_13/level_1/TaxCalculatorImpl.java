package students.denis_asipenka.lesson_13.level_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal test = new BigDecimal("20000");
        if (income.compareTo(test) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal maxPercent = income.subtract(test);
            return (test.multiply(new BigDecimal("0.25"))).add((maxPercent.multiply(new BigDecimal("0.4"))));
        }
    }
}