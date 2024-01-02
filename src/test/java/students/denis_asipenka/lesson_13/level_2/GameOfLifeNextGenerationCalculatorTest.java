package students.denis_asipenka.lesson_13.level_2;

import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    @Test
    public void weExpectTheNumberOfLivingNeighborsToBe3() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, false, false},
                        {false, false, false, false},
                        {true, true, false, true},
                        {true, true, false, true},
                };
        int liveNeighbors = gameOfLifeNextGenerationCalculator.countLiveNeighbors(testArray, 3, 0);
        assertEquals(3, liveNeighbors);
    }

    @Test
    public void weExpectTheNumberOfLivingNeighborsToBe3V1() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {false, false, false}
                };
        int liveNeighbors = gameOfLifeNextGenerationCalculator.countLiveNeighbors(testArray, 1, 0);
        assertEquals(3, liveNeighbors);
    }

    @Test
    public void weExpectTheNumberOfLivingNeighborsToBe8() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, true},
                        {true, true, true}
                };
        int liveNeighbors = gameOfLifeNextGenerationCalculator.countLiveNeighbors(testArray, 1, 1);
        assertEquals(8, liveNeighbors);
    }

    @Test
    public void weExpectTheNumberOfLivingNeighborsToBe2() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, false},
                        {false, false, true},
                        {false, true, true}
                };
        int liveNeighbors = gameOfLifeNextGenerationCalculator.countLiveNeighbors(testArray, 2, 2);
        assertEquals(2, liveNeighbors);
    }

    @Test
    public void cellDiedHavingLessThan2LivingNeighbors() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, false, false},
                        {false, false, false, false},
                        {false, false, false, true},
                        {false, false, false, true},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[3][3]);

    }

    @Test
    public void theCellSurvivedHaving2LivingNeighbors() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, false, false},
                        {false, false, false, false},
                        {false, false, false, true},
                        {false, false, true, true},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[3][3]);
    }

    @Test
    public void cellDeadIhaveMore3AliveNeighbors() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, false, false},
                        {false, true, true, false},
                        {false, true, true, true},
                        {false, false, false, false},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[2][2]);
    }

    @Test
    public void aCellSurvivesWithFewerThanThreeLivingNeighbors() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, false, false},
                        {false, false, true, false},
                        {false, false, true, true},
                        {false, false, true, false},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[2][2]);
    }

    @Test
    public void cellDeadIhaveMore3AliveNeighborsV2() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, false, false, false},
                        {true, true, false, false},
                        {true, true, false, false},
                        {false, false, false, false},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[1][0]);

    }

    @Test
    public void aCellSurvivesWithFewerThanThreeLivingNeighborsV3() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, true, false, false},
                        {true, true, true, false},
                        {false, false, false, false},
                        {false, false, false, false},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[0][1]);
    }

    @Test
    public void becomesAliveWithThreeLivinNeighbors() {
        boolean[][] testArray = new boolean[][]
                {
                        {false, false, true, false},
                        {false, true, false, true},
                        {false, false, false, false},
                        {false, false, false, false},
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[1][2]);
    }

    @Test
    public void V1() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, false, false},
                        {false, true, false},
                        {false, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[0][0]);
    }

    @Test
    public void V1_1() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, false, false},
                        {true, true, false},
                        {false, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[0][0]);
    }

    @Test
    public void V2() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {false, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[1][1]);
    }

    @Test
    public void V2_1() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {false, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[0][1]);
    }

    @Test
    public void V2_2() {  // первый столбец не обходит такое чувство
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {true, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[1][0]);
    }

    @Test
    public void V2_3() {// первый столбец не обходит такое чувство
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {false, true, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertFalse(result[0][1]);
    }

    @Test
    public void V3() {
        boolean[][] testArray = new boolean[][]
                {
                        {true, true, true},
                        {true, true, false},
                        {false, false, false}
                };
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(testArray);
        assertTrue(result[1][2]);
    }
}