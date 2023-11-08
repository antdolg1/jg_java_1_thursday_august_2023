package students.nikolajs_antonovs.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int sum = 0;

        int[][] array = new int[row][col];

        Random random = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Array sum is: " + sum);
    }
}
