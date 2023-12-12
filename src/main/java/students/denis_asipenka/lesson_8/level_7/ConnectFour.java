package students.denis_asipenka.lesson_8.level_7;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
    public int[][] createField() {
        int[][] playingField = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                playingField[i][j] = -1;
            }
        }
        return playingField;
    }

    private void printFieldToConsole(int[][] array) {
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
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

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (field[i][j] == playerToCheck) {
                    count += 1;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (field[j][i] == playerToCheck) {
                    count += 1;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][3] == playerToCheck && field[1][4] == playerToCheck && field[2][5] == playerToCheck && field[3][6] == playerToCheck) {
            return true;
        }
        if (field[1][3] == playerToCheck && field[2][4] == playerToCheck && field[3][5] == playerToCheck && field[4][6] == playerToCheck) {
            return true;
        }
        if (field[0][2] == playerToCheck && field[1][3] == playerToCheck && field[2][4] == playerToCheck && field[3][5] == playerToCheck) {
            return true;
        }
        if (field[2][3] == playerToCheck && field[3][4] == playerToCheck && field[4][5] == playerToCheck && field[5][6] == playerToCheck) {
            return true;
        }
        if (field[1][2] == playerToCheck && field[2][3] == playerToCheck && field[3][4] == playerToCheck && field[4][5] == playerToCheck) {
            return true;
        }
        if (field[0][1] == playerToCheck && field[1][2] == playerToCheck && field[2][3] == playerToCheck && field[3][4] == playerToCheck) {
            return true;
        }
        if (field[2][2] == playerToCheck && field[3][3] == playerToCheck && field[4][4] == playerToCheck && field[5][5] == playerToCheck) {
            return true;
        }
        if (field[1][1] == playerToCheck && field[2][2] == playerToCheck && field[3][3] == playerToCheck && field[4][4] == playerToCheck) {
            return true;
        }
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck && field[3][3] == playerToCheck) {
            return true;
        }
        if (field[2][0] == playerToCheck && field[3][1] == playerToCheck && field[4][2] == playerToCheck && field[5][3] == playerToCheck) {
            return true;
        }
        if (field[2][1] == playerToCheck && field[3][2] == playerToCheck && field[4][3] == playerToCheck && field[5][4] == playerToCheck) {
            return true;
        }
        if (field[1][0] == playerToCheck && field[2][1] == playerToCheck && field[3][2] == playerToCheck && field[4][3] == playerToCheck) {
            return true;
        }
        if (field[0][3] == playerToCheck && field[1][2] == playerToCheck && field[2][1] == playerToCheck && field[3][0] == playerToCheck) {
            return true;
        }
        if (field[1][3] == playerToCheck && field[2][2] == playerToCheck && field[3][1] == playerToCheck && field[4][0] == playerToCheck) {
            return true;
        }
        if (field[0][4] == playerToCheck && field[1][3] == playerToCheck && field[2][2] == playerToCheck && field[3][1] == playerToCheck) {
            return true;
        }
        if (field[2][6] == playerToCheck && field[3][5] == playerToCheck && field[4][4] == playerToCheck && field[5][3] == playerToCheck) {
            return true;
        }
        if (field[5][2] == playerToCheck && field[4][3] == playerToCheck && field[3][4] == playerToCheck && field[2][5] == playerToCheck) {
            return true;
        }
        if (field[4][3] == playerToCheck && field[3][4] == playerToCheck && field[2][5] == playerToCheck && field[1][6] == playerToCheck) {
            return true;
        }
        if (field[5][1] == playerToCheck && field[4][2] == playerToCheck && field[3][3] == playerToCheck && field[2][4] == playerToCheck) {
            return true;
        }
        if (field[4][2] == playerToCheck && field[3][3] == playerToCheck && field[2][4] == playerToCheck && field[1][5] == playerToCheck) {
            return true;
        }
        if (field[3][3] == playerToCheck && field[2][4] == playerToCheck && field[1][5] == playerToCheck && field[0][6] == playerToCheck) {
            return true;
        }
        if (field[5][0] == playerToCheck && field[4][1] == playerToCheck && field[3][2] == playerToCheck && field[2][3] == playerToCheck) {
            return true;
        }
        if (field[4][1] == playerToCheck && field[3][2] == playerToCheck && field[2][3] == playerToCheck && field[1][4] == playerToCheck) {
            return true;
        }
        if (field[3][2] == playerToCheck && field[2][3] == playerToCheck && field[1][4] == playerToCheck && field[0][5] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean isDrawPosition(int[][] field) {
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
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
            Move move1 = getNextMove();
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
        ConnectFour connectFour = new ConnectFour();
        connectFour.play();
    }
}