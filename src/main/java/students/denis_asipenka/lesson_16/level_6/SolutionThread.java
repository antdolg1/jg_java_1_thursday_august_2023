package students.denis_asipenka.lesson_16.level_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SolutionThread implements Runnable {
    int[][] oneMatrices;
    int[][] twoMatrices;
    int[] result;
    int row;

    public SolutionThread() {
    }

    public SolutionThread(int[][] oneMatrices, int[][] twoMatrices) {
        this.oneMatrices = oneMatrices;
        this.twoMatrices = twoMatrices;
    }

    public SolutionThread(int[][] oneMatrices, int[][] twoMatrices, int row) {
        this.oneMatrices = oneMatrices;
        this.twoMatrices = twoMatrices;
        this.row = row;
        this.result = new int[twoMatrices[0].length];
    }

    public int[][] getOneMatrices() {
        return oneMatrices;
    }

    public int[][] getTwoMatrices() {
        return twoMatrices;
    }

    public int[] getResult() {
        return result;
    }

    public int[][] enterTheMatrixSize() {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        System.out.println("Введите количество строк:");
        rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        cols = scanner.nextInt();
        return new int[rows][cols];
    }

    public int[][] fillingOutMatrices(int[][] matrices) {
        Random random = new Random();
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                matrices[i][j] = random.nextInt(10);
            }
        }
        return matrices;
    }

    @Override
    public void run() {
        int aCols = oneMatrices[0].length;
        int bCols = twoMatrices[0].length;
        for (int i = 0; i < bCols; i++) {
            int temp = 0;
            for (int j = 0; j < aCols; j++) {
                temp += oneMatrices[row][j] * twoMatrices[j][i];
            }
            result[i] = temp;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        boolean check = true;
        SolutionThread solution = new SolutionThread();
        int[][] oneMatrices = solution.enterTheMatrixSize();
        int[][] twoMatrices = solution.enterTheMatrixSize();
        while (check) {
            if (oneMatrices[0].length == twoMatrices.length) {
                oneMatrices = solution.fillingOutMatrices(oneMatrices);
                twoMatrices = solution.fillingOutMatrices(twoMatrices);
                check = false;
            } else {
                System.out.println("Введите матрицу у которой количество строк первой матрицы соответствуем количеству колонок второй матрицы");
                oneMatrices = solution.enterTheMatrixSize();
                twoMatrices = solution.enterTheMatrixSize();
            }
        }
        SolutionThread solutionOne = new SolutionThread(oneMatrices, twoMatrices);
        int[][] result = new int[solutionOne.getOneMatrices().length][solutionOne.getTwoMatrices()[0].length];
        SolutionThread[] solutionThreads = new SolutionThread[solutionOne.getOneMatrices().length];
        Thread[] threads = new Thread[solutionOne.getOneMatrices().length];
        for (int i = 0; i < solutionOne.getOneMatrices().length; i++) {
            solutionThreads[i] = new SolutionThread(oneMatrices, twoMatrices, i);
            threads[i] = new Thread(solutionThreads[i]);
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < solutionThreads.length; i++) {
            result[i] = solutionThreads[i].getResult();
        }
        Arrays.stream(result)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}