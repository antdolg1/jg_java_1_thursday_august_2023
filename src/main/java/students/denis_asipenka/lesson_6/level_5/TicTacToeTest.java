package students.denis_asipenka.lesson_6.level_5;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTest();
        test.isWinPositionForVerticalsTest();
        test.isWinPositionForDiagonalsTest();
        test.isWinPositionTest();
        test.isDrawPositionTest();
        test.createArray();
    }

    void isWinPositionForHorizontalsTest() {
        int[][] array = {
                {-1, -1, -1},
                {-1, -1, -1},
                {0, 0, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForHorizontals(array, 0), "Checking winnings horizontally: ");
    }

    void isWinPositionForVerticalsTest() {
        int[][] array = {
                {-1, -1, 0},
                {-1, -1, 0},
                {-1, -1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForVerticals(array, 0), "Checking winnings vertically: ");
    }

    void isWinPositionForDiagonalsTest() {
        int[][] array = {
                {0, -1, -1},
                {-1, 0, -1},
                {-1, -1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForDiagonals(array, 0), "Checking winnings diagonally: ");
    }

    void isWinPositionTest() {
        int[][] array = {
                {-1, -1, 0},
                {-1, 0, -1},
                {0, 0, -1},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPosition(array, 0), "Checking a winning position: ");
    }

    void isDrawPositionTest() {
        int[][] array = {
                {0, 1, 0},
                {1, 1, 0},
                {1, 0, 1},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isDrawPosition(array), "The position is unoccupied: ");
    }

    void createArray() {
        int[][] result = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(Arrays.deepEquals(result, ticTacToe.createField()), "Creation of empty masses (value -1): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}