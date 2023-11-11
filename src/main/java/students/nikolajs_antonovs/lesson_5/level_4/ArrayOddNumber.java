package students.nikolajs_antonovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class ArrayOddNumber {
    public static void main(String[] args) {

        int[] array = new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Odd numbers : " + array[i]);
            }
        }
    }
}
