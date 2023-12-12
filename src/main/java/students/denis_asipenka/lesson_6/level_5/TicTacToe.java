package students.denis_asipenka.lesson_6.level_5;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        } else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        } else return false;

    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }

    public boolean isDrawPosition(int[][] field) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == -1) {
                    counter = counter + 1;
                }
            }
        }
        if (counter == 0) {
            if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {
                return true;
            }
        }
        return false;
    }

    public int[][] createField() {
        int[][] array = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        return array;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х:");
        int x = scanner.nextInt();
        System.out.println("Введите координату Y:");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(" " + field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Move automaticMove(int[][] field) {
        Random random = new Random();
        int count = 0;
        int iArrayMove = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    count = count + 1;
                }
            }
        }
        Point[] emptyCells = new Point[count];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    emptyCells[iArrayMove] = new Point(i, j);
                    iArrayMove++;
                }
            }
        }
        int randomNumber = random.nextInt(count - 1);
        Move move = new Move(emptyCells[randomNumber].x, emptyCells[randomNumber].y);
        return move;
    }

    public Move recognizingWinningCombination(int[][] field) {
        int valueBot = 1;
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == -1 && field[i][1] == valueBot && field[i][2] == valueBot)) {
                return new Move(i, 0);
            }
            if ((field[0][i] == -1 && field[1][i] == valueBot && field[2][i] == valueBot)) {
                return new Move(0, i);
            }
        }
        if (field[0][0] == -1 && field[1][1] == valueBot && field[2][2] == valueBot) {
            return new Move(0, 0);
        } else if (field[2][0] == -1 && field[1][1] == valueBot && field[0][2] == valueBot) {
            return new Move(2, 0);
        }
        for (int i = 0; i < 3; i++) { // tut
            if (field[i][0] == valueBot && field[i][1] == -1 && field[i][2] == valueBot) {
                return new Move(i, 1);
            }
            if (field[0][i] == valueBot && field[1][i] == -1 && field[2][i] == valueBot) {
                return new Move(1, i);
            }
        }
        return null;
    }

    public Move recognizingLosingCombination(int[][] field) {
        int valueUser = 0;
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == -1 && field[i][1] == valueUser && field[i][2] == valueUser)) {
                return new Move(i, 0);
            }
            if ((field[0][i] == -1 && field[1][i] == valueUser && field[2][i] == valueUser)) {
                return new Move(0, i);
            }
        }
        if (field[0][0] == -1 && field[1][1] == valueUser && field[2][2] == valueUser) {
            return new Move(0, 0);
        } else if (field[2][0] == -1 && field[1][1] == valueUser && field[0][2] == valueUser) {
            return new Move(2, 0);
        }
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == valueUser && field[i][1] == -1 && field[i][2] == valueUser) {
                return new Move(i, 1);
            }
            if (field[0][i] == valueUser && field[1][i] == -1 && field[2][i] == valueUser) {
                return new Move(1, i);
            }
        }
        return null;
    }

    public Move defenseAndAttack(int[][] field) {
        if (recognizingWinningCombination(field) != null) {
            return recognizingWinningCombination(field);
        } else if (recognizingLosingCombination(field) != null) {
            return recognizingLosingCombination(field);
        } else return automaticMove(field);
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            printFieldToConsole(field);
            Move move1 = defenseAndAttack(field);
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}