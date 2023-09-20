package students.julija_pilenkova.homework.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        int m = random.nextInt(10);
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(array));


    }

}
