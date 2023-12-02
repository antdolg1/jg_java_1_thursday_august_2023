package students.denis_asipenka.lesson_16.level_6;

import java.util.*;

public class Solution {

    public int[][] enterTheMatricesSize() {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        System.out.println("Введите количество строк:");
        rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        cols = scanner.nextInt();
        return new int[rows][cols];
    }

    public void checkingPossibleMultiplication() {
        int[][] oneMatrices = enterTheMatricesSize();
        int[][] twoMatrices = enterTheMatricesSize();
        if (oneMatrices[0].length == twoMatrices.length) {
            fillingOutMatrices(oneMatrices, twoMatrices);
        } else {
            System.out.println("Введите матрицу у которой количество строк первой матрицы соответствуем количеству колонок второй матрицы");
            System.out.println();
            checkingPossibleMultiplication();
        }
    }

    public void fillingOutMatrices(int[][] oneMatrices, int[][] twoMatrices) {
        Random random = new Random();
        for (int i = 0; i < oneMatrices.length; i++) {
            for (int j = 0; j < oneMatrices[i].length; j++) {
                oneMatrices[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < twoMatrices.length; i++) {
            for (int j = 0; j < twoMatrices[i].length; j++) {
                twoMatrices[i][j] = random.nextInt(10);
            }
        }
        printMatrices(oneMatrices, twoMatrices);
        matrixProductCalculation(oneMatrices, twoMatrices);
    }

    public void printMatrices(int[][] oneMatrices, int[][] twoMatrices) {
        Arrays.stream(oneMatrices)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println();
        Arrays.stream(twoMatrices)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    public int[][] matrixProductCalculation(int[][] oneMatrices, int[][] twoMatrices) {
        int[][] resultMatricesOneThread = new int[oneMatrices.length][twoMatrices[0].length];
        for (int i = 0; i < resultMatricesOneThread.length; i++) {
            for (int j = 0; j < resultMatricesOneThread[0].length; j++) {
                resultMatricesOneThread[i][j] = 0;
                for (int k = 0; k < oneMatrices[0].length; k++) {
                    resultMatricesOneThread[i][j] += oneMatrices[i][k] * twoMatrices[k][j];
                }
            }
        }
        System.out.println();
        Arrays.stream(resultMatricesOneThread)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
        return resultMatricesOneThread;

    }

    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        solution.checkingPossibleMultiplication();
    }
}