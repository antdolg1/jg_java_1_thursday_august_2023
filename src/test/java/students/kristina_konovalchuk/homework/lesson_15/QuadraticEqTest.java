package students.kristina_konovalchuk.homework.lesson_15;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuadraticEqTest extends TestCase {
    @Test
    public void testRootsGreaterThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        double[] expected = {-1, 4};
        double[] actual = quadraticEq.calculate(1, -3, 5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRootsEqualsZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        double[] expected = {2};
        double[] actual = quadraticEq.calculate(1, -4, 4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEq quadraticEq = new QuadraticEq();
        double[] actual = quadraticEq.calculate(1, 2, 5);
        assertNull(actual);
    }
}
