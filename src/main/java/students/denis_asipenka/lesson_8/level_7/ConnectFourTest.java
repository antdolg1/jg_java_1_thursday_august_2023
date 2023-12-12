package students.denis_asipenka.lesson_8.level_7;

import java.util.Arrays;

public class ConnectFourTest {
    public static void main(String[] args) {
        ConnectFourTest test = new ConnectFourTest();
        test.createArrayTest(); // создание массива
        test.isWinPositionForHorizontals(); // проверка выигрыша по горизонтали
        test.isWinPositionForVerticals();// проверка выигрыша по вертикали
        test.isWinPositionForDiagonals(); // проверка выигрыша по диагонали
        test.isDrawPosition();
    }

    void createArrayTest() {
        int[][] result = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        ConnectFour connectFour = new ConnectFour();
        int[][] array = connectFour.createField();
        checkTestResult(Arrays.deepEquals(result, array), "Создание игрового полня размером 7х6 " +
                "и заполнение пустыми значениями: ");
        int[][] result1 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int[][] array1 = connectFour.createField();
        checkTestResult(Arrays.deepEquals(result1, array1), "Создание игрового полня размером 7х6 " +
                "и заполнение пустыми значениями (*FAIL*): ");
    }

    void isWinPositionForHorizontals() {
        int[][] result = new int[][]
                {
                        {0, 0, 0, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user = 0;
        ConnectFour connectFour = new ConnectFour();
        checkTestResult(connectFour.isWinPositionForHorizontals(result, user), "Проверка на выигрыш в первой строке: ");
        int[][] result2 = new int[][]
                {
                        {-1, 0, 0, 0, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user2 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result2, user2), "Проверка на выигрыш в первой строке: ");
        int[][] result3 = new int[][]
                {
                        {0, -1, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user3 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result3, user3), "Проверка на выигрыш в первой строке: ");
        int[][] result4 = new int[][]
                {
                        {-1, -1, -1, 0, 0, 0, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user4 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result4, user4), "Проверка на выигрыш в первой строке: ");
        int[][] result5 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {0, 0, 0, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user5 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result5, user5), "Проверка на выигрыш во второй строке: ");
        int[][] result6 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, 0, 0, 0, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user6 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result6, user6), "Проверка на выигрыш во второй строке: ");
        int[][] result7 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user7 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result7, user7), "Проверка на выигрыш во второй строке: ");
        int[][] result8 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, 0, 0, 0, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user8 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result8, user8), "Проверка на выигрыш во второй строке: ");
        int[][] result9 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, 0, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user9 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result9, user9), "Проверка на выигрыш в третий строке: ");
        int[][] result10 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, 0, 0, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user10 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result10, user10), "Проверка на выигрыш в третий строке: ");
        int[][] result11 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user11 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result11, user11), "Проверка на выигрыш в третий строке: ");
        int[][] result12 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, 0, 0, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user12 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result12, user12), "Проверка на выигрыш в третий строке: ");
        int[][] result13 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, 0, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user13 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result13, user13), "Проверка на выигрыш в четвертой строке: ");
        int[][] result14 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, 0, 0, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user14 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result14, user14), "Проверка на выигрыш в четвертой строке: ");
        int[][] result15 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user15 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result15, user15), "Проверка на выигрыш в четвертой строке: ");
        int[][] result16 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, 0, 0, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user16 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result16, user16), "Проверка на выигрыш в четвертой строке: ");
        int[][] result17 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, 0, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user17 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result17, user17), "Проверка на выигрыш в пятой строке: ");
        int[][] result18 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, 0, 0, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user18 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result18, user18), "Проверка на выигрыш в пятой строке: ");
        int[][] result19 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user19 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result19, user19), "Проверка на выигрыш в пятой строке: ");
        int[][] result20 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, 0, 0, 0},
                        {-1, -1, -1, -1, -1, -1, -1},

                };
        int user20 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result20, user20), "Проверка на выигрыш в пятой строке: ");
        int[][] result21 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, 0, 0, -1, -1, -1},

                };
        int user21 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result21, user21), "Проверка на выигрыш в шестой строке: ");
        int[][] result22 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, 0, 0, 0, -1, -1},

                };
        int user22 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result22, user22), "Проверка на выигрыш в шестой строке: ");
        int[][] result23 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, 0, 0, 0, -1},

                };
        int user23 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result23, user23), "Проверка на выигрыш в шестой строке: ");
        int[][] result24 = new int[][]
                {
                        {-1, -1, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, 0, 0, 0},

                };
        int user24 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result24, user24), "Проверка на выигрыш в шестой строке: ");
        int[][] result25 = new int[][]
                {
                        {-1, 0, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user25 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result25, user25), "Проверка на выигрыш в первой строке (*FAIL*): ");
        int[][] result26 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user26 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result26, user26), "Проверка на выигрыш во второй строке (*FAIL*): ");
        int[][] result27 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user27 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result27, user27), "Проверка на выигрыш в третий строке (*FAIL*): ");
        int[][] result28 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user28 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result28, user28), "Проверка на выигрыш в четвертой строке (*FAIL*): ");
        int[][] result29 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user29 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result29, user29), "Проверка на выигрыш в пятой строке (*FAIL*): ");
        int[][] result1 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, 0, -1},
                };
        int user1 = 0;
        checkTestResult(connectFour.isWinPositionForHorizontals(result1, user1), "Проверка на выигрыш в шестой строке (*FAIL*): ");
    }

    void isWinPositionForVerticals() {
        int[][] result = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user = 0;
        ConnectFour connectFour = new ConnectFour();
        checkTestResult(connectFour.isWinPositionForVerticals(result, user), "Проверка на выигрыш в первом столбце: ");
        int[][] result1 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                };
        int user1 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result1, user1), "Проверка на выигрыш в первом столбце: ");
        int[][] result2 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user2 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result2, user2), "Проверка на выигрыш в первом столбце: ");
        int[][] result3 = new int[][]
                {
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user3 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result3, user3), "Проверка на выигрыш во втором столбце: ");
        int[][] result4 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user4 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result4, user4), "Проверка на выигрыш во втором столбце: ");
        int[][] result5 = new int[][]
                {
                        {-1, -0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                };
        int user5 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result5, user5), "Проверка на выигрыш во втором столбце: ");
        int[][] result6 = new int[][]
                {
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {0, -1, 0, -1, -1, -1, -1},
                        {0, 0, 0, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user6 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result6, user6), "Проверка на выигрыш в третьем столбце: ");
        int[][] result7 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {0, -1, 0, -1, -1, -1, -1},
                        {0, 0, 0, -1, -1, -1, -1},
                        {-1, 0, 0, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user7 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result7, user7), "Проверка на выигрыш в третьем столбце: ");
        int[][] result8 = new int[][]
                {
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {0, 0, 0, -1, -1, -1, -1},
                        {0, -1, 0, -1, -1, -1, -1},
                        {-1, 0, 0, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                };
        int user8 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result8, user8), "Проверка на выигрыш в третьем столбце: ");
        int[][] result9 = new int[][]
                {
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {0, -1, -1, 0, -1, -1, -1},
                        {0, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user9 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result9, user9), "Проверка на выигрыш в четвертом столбце: ");
        int[][] result10 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, 0, -1, -1, -1},
                        {0, -1, -1, 0, -1, -1, -1},
                        {0, 0, -1, 0, -1, -1, -1},
                        {-1, 0, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user10 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result10, user10), "Проверка на выигрыш в четвертом столбце: ");
        int[][] result11 = new int[][]
                {
                        {-1, -0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, -1, 0, -1, -1, -1},
                        {0, -1, -1, 0, -1, -1, -1},
                        {-1, 0, -1, 0, -1, -1, -1},
                        {-1, 0, -1, 0, -1, -1, -1},
                };
        int user11 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result11, user11), "Проверка на выигрыш в четвертом столбце: ");

        int[][] result12 = new int[][]
                {
                        {-1, 0, -1, -1, 0, -1, -1},
                        {-1, 0, -1, -1, 0, -1, -1},
                        {0, -1, -1, -1, 0, -1, -1},
                        {0, 0, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user12 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result12, user12), "Проверка на выигрыш в пятом столбце: ");
        int[][] result13 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, 0, -1, -1},
                        {0, -1, -1, -1, 0, -1, -1},
                        {0, 0, -1, -1, 0, -1, -1},
                        {-1, 0, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user13 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result13, user13), "Проверка на выигрыш в пятом столбце: ");
        int[][] result14 = new int[][]
                {
                        {-1, -0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                };
        int user14 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result14, user14), "Проверка на выигрыш в пятом столбце: ");
        int[][] result15 = new int[][]
                {
                        {-1, 0, -1, -1, -1, 0, -1},
                        {-1, 0, -1, -1, -1, 0, -1},
                        {0, -1, -1, -1, -1, 0, -1},
                        {0, 0, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user15 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result15, user15), "Проверка на выигрыш в шестом столбце: ");
        int[][] result16 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, 0, -1},
                        {0, 0, -1, -1, -1, 0, -1},
                        {0, -1, -1, -1, -1, 0, -1},
                        {-1, 0, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user16 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result16, user16), "Проверка на выигрыш в шестом столбце: ");
        int[][] result17 = new int[][]
                {
                        {-1, -0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, 0, -1, -1, -1, 0, -1},
                        {0, 0, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, 0, -1, -1, -1, 0, -1},
                };
        int user17 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result17, user17), "Проверка на выигрыш в шестом столбце: ");
        int[][] result18 = new int[][]
                {
                        {-1, 0, -1, -1, -1, -1, 0},
                        {-1, 0, -1, -1, -1, -1, 0},
                        {0, -1, -1, -1, -1, -1, 0},
                        {0, 0, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user18 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result18, user18), "Проверка на выигрыш в седьмом столбце: ");
        int[][] result19 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, 0},
                        {0, -1, -1, -1, -1, -1, 0},
                        {0, 0, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user19 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result19, user19), "Проверка на выигрыш в седьмом столбце: ");
        int[][] result20 = new int[][]
                {
                        {-1, -0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, 0},
                };
        int user20 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result20, user20), "Проверка на выигрыш в седьмом столбце: ");
        int[][] result21 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user21 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result21, user21), "Проверка на выигрыш в первом столбце (*FAIL*): ");
        int[][] result22 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user22 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result22, user22), "Проверка на выигрыш во втором столбце (*FAIL*): ");
        int[][] result23 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user23 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result23, user23), "Проверка на выигрыш в третьем столбце (*FAIL*): ");
        int[][] result24 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user24 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result24, user24), "Проверка на выигрыш в четвертом столбце (*FAIL*): ");
        int[][] result25 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user25 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result25, user25), "Проверка на выигрыш в пятом столбце (*FAIL*): ");
        int[][] result26 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user26 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result26, user26), "Проверка на выигрыш в шестом столбце (*FAIL*): ");
        int[][] result27 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, 0},
                        {1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user27 = 0;
        checkTestResult(connectFour.isWinPositionForVerticals(result27, user27), "Проверка на выигрыш в седьмом столбце (*FAIL*): ");
    }

    void isWinPositionForDiagonals() {
        int[][] result = new int[][]
                {
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user = 0;
        ConnectFour connectFour = new ConnectFour();
        checkTestResult(connectFour.isWinPositionForDiagonals(result, user), "Проверка на выигрыш диагональ : ");
        int[][] result1 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user1 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result1, user1), "Проверка на выигрыш диагональ : ");
        int[][] result2 = new int[][]
                {
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user2 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result2, user2), "Проверка на выигрыш диагональ : ");
        int[][] result3 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                };
        int user3 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result3, user3), "Проверка на выигрыш диагональ : ");
        int[][] result4 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user4 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result4, user4), "Проверка на выигрыш диагональ : ");
        int[][] result5 = new int[][]
                {
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user5 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result5, user5), "Проверка на выигрыш диагональ : ");
        int[][] result6 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                };
        int user6 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result6, user6), "Проверка на выигрыш диагональ : ");
        int[][] result7 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user7 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result7, user7), "Проверка на выигрыш диагональ : ");
        int[][] result8 = new int[][]
                {
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user8 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result8, user8), "Проверка на выигрыш диагональ : ");
        int[][] result9 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                };
        int user9 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result9, user9), "Проверка на выигрыш диагональ : ");
        int[][] result10 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                };
        int user10 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result10, user10), "Проверка на выигрыш диагональ : ");
        int[][] result11 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user11 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result11, user11), "Проверка на выигрыш диагональ : ");
        int[][] result13 = new int[][]
                {
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user13 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result13, user13), "Проверка на выигрыш диагональ : ");
        int[][] result14 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user14 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result14, user14), "Проверка на выигрыш диагональ : ");
        int[][] result15 = new int[][]
                {
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user15 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result15, user15), "Проверка на выигрыш диагональ : ");
        int[][] result16 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                };
        int user16 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result16, user16), "Проверка на выигрыш диагональ : ");
        int[][] result17 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                };
        int user17 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result17, user17), "Проверка на выигрыш диагональ : ");
        int[][] result18 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user18 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result18, user18), "Проверка на выигрыш диагональ : ");
        int[][] result19 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                };
        int user19 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result19, user19), "Проверка на выигрыш диагональ : ");
        int[][] result20 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user20 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result20, user20), "Проверка на выигрыш диагональ : ");
        int[][] result21 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user21 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result21, user21), "Проверка на выигрыш диагональ : ");
        int[][] result22 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {0, -1, -1, -1, -1, -1, -1},
                };
        int user22 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result22, user22), "Проверка на выигрыш диагональ : ");
        int[][] result23 = new int[][]
                {
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, 0, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user23 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result23, user23), "Проверка на выигрыш диагональ : ");
        int[][] result24 = new int[][]
                {
                        {-1, -1, -1, -1, -1, 0, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, 0, -1, -1, -1},
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user24 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result24, user24), "Проверка на выигрыш диагональ : ");
        int[][] result12 = new int[][]
                {
                        {-1, -1, 0, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, 0, -1, -1},
                        {-1, -1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1, 0},
                        {-1, -1, -1, -1, -1, -1, -1},
                };
        int user12 = 0;
        checkTestResult(connectFour.isWinPositionForDiagonals(result12, user12), "Проверка на выигрыш диагональ (*FAIL*): ");

    }

    void isDrawPosition() {
        int[][] result = new int[][]
                {
                        {1, 0, 1, 1, 0, 0, 1},
                        {1, 1, 0, 1, 1, 0, 0},
                        {1, 0, 1, 0, 0, 0, 1},
                        {0, 1, 0, 0, 1, 1, 0},
                        {0, 0, 1, 1, 1, 0, 1},
                        {1, 1, 0, 0, 1, 1, 0},
                };
        ConnectFour connectFour = new ConnectFour();
        checkTestResult(connectFour.isDrawPosition(result), "Проверка на ничейный результат: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}