package students.aleksandrs_kunicins.homework.lesson_6.level_5_middle;

class TicTacToe {
    int firstPlayer = 0, secondPlayer = 1, emptyField = -1;
    int[][] ticTacToe = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck)
                || (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck)
                || (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck)
                || (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck)
                || (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForDiogonals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck)
                || (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe ttt = new TicTacToe();
        if ((ttt.isWinPositionForVerticals(field, playerToCheck) == true)
                || ttt.isWinPositionForHorizontals(field, playerToCheck) == true
                || ttt.isWinPositionForDiogonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        TicTacToe ttt = new TicTacToe();
        if ((ttt.isWinPosition(field, 1) == false) && (ttt.isWinPosition(field, 0) == false)) {
            return true;
        } else {
            return false;
        }
    }
}

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.shouldReturnIsWinPositionForHorizontals();
        test.shouldReturnIsWinPositionForVerticals();
        test.shouldReturnIsWinPositionForDiogonals();
        test.shouldReturnIsWinPosition();
        test.shouldReturnIsDrawPosition();
    }

    public void shouldReturnIsWinPositionForHorizontals() {
        TicTacToe tt = new TicTacToe();
        int[][] testField = { { 0, 0, 0 }, { -1, -1, -1 }, { -1, -1, -1 } };
        int player = 0;
        boolean expectedResult = true;
        if (expectedResult == tt.isWinPositionForHorizontals(testField, player)) {
            System.out.println("Horizontals function : OK!");
        } else {
            System.out.println("Horizontals function : Failed!");
        }
    }

    public void shouldReturnIsWinPositionForVerticals() {
        TicTacToe tt = new TicTacToe();
        int[][] testField = { { 0, -1, -1 }, { 0, -1, -1 }, { 0, -1, -1 } };
        int player = 0;
        boolean expectedResult = true;
        if (expectedResult == tt.isWinPositionForVerticals(testField, player)) {
            System.out.println("Verticals function : OK!");
        } else {
            System.out.println("Verticals function : Failed!");
        }
    }

    public void shouldReturnIsWinPositionForDiogonals() {
        TicTacToe tt = new TicTacToe();
        int[][] testField = { { -1, -1, -1 }, { 0, 0, 0 }, { -1, -1, -1 } };
        int player = 0;
        boolean expectedResult = false;
        if (expectedResult == tt.isWinPositionForDiogonals(testField, player)) {
            System.out.println("Diogonals function : OK!");
        } else {
            System.out.println("Diogonals function : Failed!");
        }
    }

    public void shouldReturnIsWinPosition() {
        TicTacToe tt = new TicTacToe();
        int[][] testField = { { 0, 0, 0 }, { -1, -1, -1 }, { 0, 0, 0 } };
        int player = 0;
        boolean expectedResult = true;
        if (expectedResult == tt.isWinPosition(testField, player)) {
            System.out.println("Win Position function : OK!");
        } else {
            System.out.println("Win Position function : Failed!");
        }
    }

    public void shouldReturnIsDrawPosition() {
        TicTacToe tt = new TicTacToe();
        int[][] testField = { { 0, 0, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        boolean expectedResult = true;
        if (expectedResult == tt.isDrawPosition(testField)) {
            System.out.println("Draw  function : OK!");
        } else {
            System.out.println("Draw function : Failed!");
        }
    }
}