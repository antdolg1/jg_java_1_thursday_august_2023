package students.denis_asipenka.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    @Test
    public void weExpectDiscriminantGreaterThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        String result = quadraticEq.calc(1, -3, 2);
        assertEquals("x1 = 1.0, x2 = 2.0", result);
    }

    @Test
    public void weExpectDiscriminantIsZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        String result = quadraticEq.calc(1, -4, 4);
        assertEquals("x = 2.0", result);
    }

    @Test
    public void weExpectDiscriminantLessThanZero() {
        QuadraticEq equation = new QuadraticEq();
        String result = equation.calc(1, 1, 1);
        assertEquals("Equation has no roots", result);
    }
}