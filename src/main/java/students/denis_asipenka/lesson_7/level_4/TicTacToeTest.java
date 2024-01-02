package students.denis_asipenka.lesson_7.level_4;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTest(); // проверка выигрышной позиции по горизонтали
        test.isWinPositionForVerticalsTest(); // проверка выигрышной позиции по вертикали
        test.isWinPositionForDiagonalsTest(); // проверка выигрышной позиции по диагонали
        test.isDrawPositionTest(); // проверка что никто не выиграл
        test.createArray(); // проверка создается ли массив и заполняется ли массив значениями -1
        test.allCombinationsForProtection(); // проверка всех комбинаций для защиты от выигрыша пользователя (шаг чтобы бот не проиграл)
        test.allCombinationsToWin();// проверка всех комбинаций для победы бота (шаг чтобы бот выиграл)
        test.generalWinningCheck();
    }

    void generalWinningCheck() {
        int[][] array = {
                {0, 0, -1},
                {-1, 0, 0},
                {0, -1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPosition(array, 0), "Проверка на выигрыш в одной из комбинаций: ");
    }
    void isWinPositionForHorizontalsTest() {
        int[][] array = {
                {0, 0, 0},
                {-1, -1, 0},
                {0, -1, -1},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForHorizontals(array, 0), "Проверка выигрышной позиции по горизонтали 1 строка: ");
        int[][] array1 = {
                {-1, -1, -1},
                {0, 0, 0},
                {0, -1, 0},};
        checkTestResult(ticTacToe.isWinPositionForHorizontals(array1, 0), "Проверка выигрышной позиции по горизонтали 2 строка: ");
        int[][] array2 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {0, 0, 0},};
        checkTestResult(ticTacToe.isWinPositionForHorizontals(array2, 0), "Проверка выигрышной позиции по горизонтали 3 строка: ");
    }
    void isWinPositionForVerticalsTest() {
        int[][] array = {
                {0, -1, 0},
                {0, -1, -1},
                {0, -1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForVerticals(array, 0), "Проверка выигрышной позиции по вертикали первый столбец: ");
        int[][] array1 = {
                {-1, 0, -1},
                {-1, 0, -1},
                {-1, 0, -1},};
        checkTestResult(ticTacToe.isWinPositionForVerticals(array1, 0), "Проверка выигрышной позиции по вертикали второй столбец: ");
        int[][] array2 = {
                {-1, -1, 0},
                {-1, -1, 0},
                {-1, -1, 0},};
        checkTestResult(ticTacToe.isWinPositionForVerticals(array2, 0), "Проверка выигрышной позиции по вертикали третий столбец: ");
    }

    void isWinPositionForDiagonalsTest() {
        int[][] array = {
                {0, -1, -1},
                {-1, 0, -1},
                {-1, -1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isWinPositionForDiagonals(array, 0), "Проверка выигрыша по диагонали (слева на права): ");
        int[][] array1 = {
                {-1, -1, 0},
                {-1, 0, -1},
                {0, -1, 0},};
        checkTestResult(ticTacToe.isWinPositionForDiagonals(array1, 0), "Проверка выигрыша по диагонали (справа на лево): ");
    }
    void isDrawPositionTest() {
        int[][] array = {
                {0, 1, 0},
                {1, 1,0},
                {1, 0, 1},};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.isDrawPosition(array), "Проверка что случилась ничья: ");
    }

    void createArray() {
        int[][] result = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(Arrays.deepEquals(result, ticTacToe.createField()), "Проверка заполняется ли массив значения -1: ");
    }
    void allCombinationsForProtection() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {-1, 0, 0},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result = ticTacToe.recognizingLosingCombination(array);
        if (result.getX() == 0 && result.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша первой строки 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первой строки 1 числа");
        int[][] array1 = {
                {0, -1, 0},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result1 = ticTacToe.recognizingLosingCombination(array1);
        if (result1.getX() == 0 && result1.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша первой строки 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первой строки 2 числа");
        int[][] array2 = {
                {0, 0, -1},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result2 = ticTacToe.recognizingLosingCombination(array2);
        if (result2.getX() == 0 && result2.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша первой строки 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первой строки 3 числа");
        int[][] array4 = {
                {-1, -1, -1},
                {-1, 0, 0},
                {-1, -1, -1},};
        Move result4 = ticTacToe.recognizingLosingCombination(array4);
        if (result4.getX() == 1 && result4.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша второй строки 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второй строки 1 числа");

        int[][] array5 = {
                {-1, -1, -1},
                {0, -1, 0},
                {-1, -1, -1},};
        Move result5 = ticTacToe.recognizingLosingCombination(array5);
        if (result5.getX() == 1 && result5.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша второй строки 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второй строки 2 числа");

        int[][] array6 = {
                {-1, -1, -1},
                {0, 0, -1},
                {-1, -1, -1},};
        Move result6 = ticTacToe.recognizingLosingCombination(array6);
        if (result6.getX() == 1 && result6.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша второй строки 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второй строки 3 числа");

        int[][] array7 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, 0, 0},};
        Move result7 = ticTacToe.recognizingLosingCombination(array7);
        if (result7.getX() == 2 && result7.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша третий строки 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третий строки 1 числа");

        int[][] array8 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {0, -1, 0},};
        Move result8 = ticTacToe.recognizingLosingCombination(array8);
        if (result8.getX() == 2 && result8.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша третий строки 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третий строки 2 числа");

        int[][] array3 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {0, 0, -1},};
        Move result3 = ticTacToe.recognizingLosingCombination(array3);
        if (result3.getX() == 2 && result3.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша третий строки 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третий строки 3 числа");


        int[][] array9 = {
                {-1, -1, -1},
                {0, -1, -1},
                {0, -1, -1},};
        Move result9 = ticTacToe.recognizingLosingCombination(array9);
        if (result9.getX() == 0 && result9.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша первого столбца 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первого столбца 1 числа");
        int[][] array10 = {
                {0, -1, -1},
                {-1, -1, -1},
                {0, -1, -1},};
        Move result10 = ticTacToe.recognizingLosingCombination(array10);
        if (result10.getX() == 1 && result10.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша первого столбца 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первого столбца 2 числа");
        int[][] array11 = {
                {0, -1, -1},
                {0, -1, -1},
                {-1, -1, -1},};
        Move result11 = ticTacToe.recognizingLosingCombination(array11);
        if (result11.getX() == 2 && result11.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша первого столбца 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша первого столбца 3 числа");

        int[][] array12 = {
                {-1, -1, -1},
                {-1, 0, -1},
                {-1, 0, -1},};
        Move result12 = ticTacToe.recognizingLosingCombination(array12);
        if (result12.getX() == 0 && result12.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша второго столбца 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второго столбца 1 числа");
        int[][] array13 = {
                {-1, 0, -1},
                {-1, -1, -1},
                {-1, 0, -1},};
        Move result13 = ticTacToe.recognizingLosingCombination(array13);
        if (result13.getX() == 1 && result13.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша второго столбца 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второго столбца 2 числа");
        int[][] array14 = {
                {-1, 0, -1},
                {-1, 0, -1},
                {-1, -1, -1},};
        Move result14 = ticTacToe.recognizingLosingCombination(array14);
        if (result14.getX() == 2 && result14.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша второго столбца 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша второго столбца 3 числа");
        int[][] array15 = {
                {-1, -1, -1},
                {-1, -1, 0},
                {-1, -1, 0},};
        Move result15 = ticTacToe.recognizingLosingCombination(array15);
        if (result15.getX() == 0 && result15.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша третьего столбца 1 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третьего столбца 1 числа");
        int[][] array16 = {
                {-1, -1, 0},
                {-1, -1, -1},
                {-1, -1, 0},};
        Move result16 = ticTacToe.recognizingLosingCombination(array16);
        if (result16.getX() == 1 && result16.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша третьего столбца 2 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третьего столбца 2 числа");
        int[][] array17 = {
                {-1, -1, 0},
                {-1, -1, 0},
                {-1, -1, -1},};
        Move result17 = ticTacToe.recognizingLosingCombination(array17);
        if (result17.getX() == 2 && result17.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша третьего столбца 3 числа");
        } else checkTestResult(false, "Проверка на защиту от проигрыша третьего столбца 3 числа");
        int[][] array18 = {
                {-1, -1, -1},
                {-1, 0, -1},
                {-1, -1, 0},};
        Move result18 = ticTacToe.recognizingLosingCombination(array18);
        if (result18.getX() == 0 && result18.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (слева на право) 1 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (слева на право) 1 число");
        int[][] array19 = {
                {0, -1, -1},
                {-1, -1, -1},
                {-1, -1, 0},};
        Move result19 = ticTacToe.recognizingLosingCombination(array19);
        if (result19.getX() == 1 && result19.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (слева на право) 2 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (слева на право) 2 число");
        int[][] array20 = {
                {0, -1, -1},
                {-1, 0, -1},
                {-1, -1, -1},};
        Move result20 = ticTacToe.recognizingLosingCombination(array20);
        if (result20.getX() == 2 && result20.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (слева на право) 3 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (слева на право) 3 число");
        int[][] array21 = {
                {-1, -1, -1},
                {-1, 0, -1},
                {0, -1, -1},};
        Move result21 = ticTacToe.recognizingLosingCombination(array21);
        if (result21.getX() == 0 && result21.getY() == 2) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (справа на лево) 1 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (справа на лево) 1 число");
        int[][] array22 = {
                {-1, -1, 0},
                {-1, -1, -1},
                {0, -1, -1},};
        Move result22 = ticTacToe.recognizingLosingCombination(array22);
        if (result22.getX() == 1 && result22.getY() == 1) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (справа на лево) 2 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (справа на лево) 2 число");
        int[][] array23 = {
                {-1, -1, 0},
                {-1, 0, -1},
                {-1, -1, -1},};
        Move result23 = ticTacToe.recognizingLosingCombination(array23);
        if (result23.getX() == 2 && result23.getY() == 0) {
            checkTestResult(true, "Проверка на защиту от проигрыша диагонали (справа на лево) 3 число");
        } else checkTestResult(false, "Проверка на защиту от проигрыша диагонали (справа на лево) 3 число");
    }

    void allCombinationsToWin() { // тест на проверку атаки бота
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {-1, 1, 1},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result = ticTacToe.recognizingWinningCombination(array);
        if (result.getX() == 0 && result.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции первой строки 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции первой строки 1 числа");
        int[][] array1 = {
                {1, -1, 1},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result1 = ticTacToe.recognizingWinningCombination(array1);
        if (result1.getX() == 0 && result1.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции первой строки 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции первой строки 2 числа");
        int[][] array2 = {
                {1, 1, -1},
                {-1, -1, -1},
                {-1, -1, -1},};
        Move result2 = ticTacToe.recognizingWinningCombination(array2);
        if (result2.getX() == 0 && result2.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции первой строки 3 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции первой строки 3 числа");
        int[][] array4 = {
                {-1, -1, -1},
                {-1, 1, 1},
                {-1, -1, -1},};
        Move result4 = ticTacToe.recognizingWinningCombination(array4);
        if (result4.getX() == 1 && result4.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции второй строки 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второй строки 1 числа");

        int[][] array5 = {
                {-1, -1, -1},
                {1, -1, 1},
                {-1, -1, -1},};
        Move result5 = ticTacToe.recognizingWinningCombination(array5);
        if (result5.getX() == 1 && result5.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции второй строки 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второй строки 2 числа");

        int[][] array6 = {
                {-1, -1, -1},
                {1, 1, -1},
                {-1, -1, -1},};
        Move result6 = ticTacToe.recognizingWinningCombination(array6);
        if (result6.getX() == 1 && result6.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции второй строки 3 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второй строки 3 числа");

        int[][] array7 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, 1, 1},};
        Move result7 = ticTacToe.recognizingWinningCombination(array7);
        if (result7.getX() == 2 && result7.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции третий строки 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третий строки 1 числа");

        int[][] array8 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {1, -1, 1},};
        Move result8 = ticTacToe.recognizingWinningCombination(array8);
        if (result8.getX() == 2 && result8.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции третий строки 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третий строки 2 числа");

        int[][] array3 = {
                {-1, -1, -1},
                {-1, -1, -1},
                {1, 1, -1},};
        Move result3 = ticTacToe.recognizingWinningCombination(array3);
        if (result3.getX() == 2 && result3.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции третий строки 3 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третий строки 3 числа");
        int[][] array9 = {
                {-1, -1, -1},
                {1, -1, -1},
                {1, -1, -1},};
        Move result9 = ticTacToe.recognizingWinningCombination(array9);
        if (result9.getX() == 0 && result9.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции первого столбца 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции первого столбца 1 числа");
        int[][] array10 = {
                {1, -1, -1},
                {-1, -1, -1},
                {1, -1, -1},};
        Move result10 = ticTacToe.recognizingWinningCombination(array10);
        if (result10.getX() == 1 && result10.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции первого столбца 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции первого столбца 2 числа");
        int[][] array11 = {
                {1, -1, -1},
                {1, -1, -1},
                {-1, -1, -1},};
        Move result11 = ticTacToe.recognizingWinningCombination(array11);
        if (result11.getX() == 2 && result11.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции первого столбца 3 числа");
        } else checkTestResult(false, "ППроверка выигрышной позиции первого столбца 3 числа");
        int[][] array12 = {
                {-1, -1, -1},
                {-1, 1, -1},
                {-1, 1, -1},};
        Move result12 = ticTacToe.recognizingWinningCombination(array12);
        if (result12.getX() == 0 && result12.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции второго столбца 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второго столбца 1 числа");
        int[][] array13 = {
                {-1, 1, -1},
                {-1, -1, -1},
                {-1, 1, -1},};
        Move result13 = ticTacToe.recognizingWinningCombination(array13);
        if (result13.getX() == 1 && result13.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции второго столбца 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второго столбца 2 числа");
        int[][] array14 = {
                {-1, 1, -1},
                {-1, 1, -1},
                {-1, -1, -1},};
        Move result14 = ticTacToe.recognizingWinningCombination(array14);
        if (result14.getX() == 2 && result14.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции второго столбца 3 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции второго столбца 3 числа");
        int[][] array15 = {
                {-1, -1, -1},
                {-1, -1, 1},
                {-1, -1,1},};
        Move result15 = ticTacToe.recognizingWinningCombination(array15);
        if (result15.getX() == 0 && result15.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции третьего столбца 1 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третьего столбца 1 числа");
        int[][] array16 = {
                {-1, -1, 1},
                {-1, -1, -1},
                {-1, -1, 1},};
        Move result16 = ticTacToe.recognizingWinningCombination(array16);
        if (result16.getX() == 1 && result16.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции третьего столбца 2 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третьего столбца 2 числа");
        int[][] array17 = {
                {-1, -1, 1},
                {-1, -1, 1},
                {-1, -1, -1},};
        Move result17 = ticTacToe.recognizingWinningCombination(array17);
        if (result17.getX() == 2 && result17.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции третьего столбца 3 числа");
        } else checkTestResult(false, "Проверка выигрышной позиции третьего столбца 3 числа");
        int[][] array18 = {
                {-1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1},};
        Move result18 = ticTacToe.recognizingWinningCombination(array18);
        if (result18.getX() == 0 && result18.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (слева на право) 1 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (слева на право) 1 число");
        int[][] array19 = {
                {1, -1, -1},
                {-1, -1, -1},
                {-1, -1, 1},};
        Move result19 = ticTacToe.recognizingWinningCombination(array19);
        if (result19.getX() == 1 && result19.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (слева на право) 2 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (слева на право) 2 число");
        int[][] array20 = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, -1},};
        Move result20 = ticTacToe.recognizingWinningCombination(array20);
        if (result20.getX() == 2 && result20.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (слева на право) 3 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (слева на право) 3 число");
        int[][] array21 = {
                {-1, -1, -1},
                {-1, 1, -1},
                {1, -1, -1},};
        Move result21 = ticTacToe.recognizingWinningCombination(array21);
        if (result21.getX() == 0 && result21.getY() == 2) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (справа на лево) 1 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (справа на лево) 1 число");
        int[][] array22 = {
                {-1, -1, 1},
                {-1, -1, -1},
                {1, -1, -1},};
        Move result22 = ticTacToe.recognizingWinningCombination(array22);
        if (result22.getX() == 1 && result22.getY() == 1) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (справа на лево) 2 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (справа на лево) 2 число");
        int[][] array23 = {
                {-1, -1, 1},
                {-1, 1, -1},
                {-1, -1, -1},};
        Move result23 = ticTacToe.recognizingWinningCombination(array23);
        if (result23.getX() == 2 && result23.getY() == 0) {
            checkTestResult(true, "Проверка выигрышной позиции диагонали (справа на лево) 3 число");
        } else checkTestResult(false, "Проверка выигрышной позиции диагонали (справа на лево) 3 число");
    }

    void diagonalAttack() {
        Move moveTest = new Move(1, 1);
        Move moveTest1 = new Move(1, 1);

        if (moveTest1.equals(moveTest)) {
            System.out.println("ff");
        }
        int[][] array = {
                {-1, -1, -1},
                {-1, 0, -1},
                {-1, -1, 0},};

        TicTacToe ticTacToe = new TicTacToe();
        checkTestResult(ticTacToe.recognizingWinningCombination(array).equals(moveTest), "Определение выигрыша и реализация победы от него: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}