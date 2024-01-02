package students.aleksandrs_kunicins.homework.lesson_6.level_6_middle;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe2 {
    public int[][] createField() {
        int[][] field = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };
        return field;
    }

    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("First player x = ");
        x = sc.nextInt();

        System.out.println("First player y = ");
        y = sc.nextInt();

        sc.close();

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        int numRows = field.length;
        int numCols = field[0].length;

        System.out.println("Player field:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (field[i][j] == 0) {
                    System.out.print(" - ");
                } else if (field[i][j] == 1) {
                    System.out.print(" X ");
                } else if (field[i][j] == 2) {
                    System.out.print(" O ");
                }

                if (j < numCols - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < numRows - 1) {
                for (int k = 0; k < numCols; k++) {
                    System.out.print("---");
                    if (k < numCols - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
    }

}

class TicTacToe2Test {
    public static void main(String[] args) {
        TicTacToe2Test test = new TicTacToe2Test();
        test.shouldReturnEmptyField();
    }

    public void shouldReturnEmptyField() {
        TicTacToe2 tt2 = new TicTacToe2();
        int[][] expectedField = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };
        boolean areEqual = Arrays.deepEquals(expectedField, tt2.createField());
        if (areEqual) {
            System.out.println("Empty massive test : OK!");
        } else {
            System.out.println("Empty massive test : Failed!");
        }
    }
}