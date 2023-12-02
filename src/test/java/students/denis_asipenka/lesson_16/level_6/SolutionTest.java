package students.denis_asipenka.lesson_16.level_6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    int[][] oneArray = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
    };
    int[][] twoArray = new int[][]{
            {5, 2, 8},
            {5, 4, 5},
            {5, 2, 5},
            {2, 4, 7},
    };
    int[][] resultArray = new int[][]{
            {38, 32, 61},
            {106, 80, 161}
    };

    @Test
    public void weExpectTheResultOfTheProductOfMatricesInOneThread() {
        Solution solution = new Solution();
        int[][] actualResult = solution.matrixProductCalculation(oneArray, twoArray);
        assertArrayEquals(resultArray, actualResult);
    }
}