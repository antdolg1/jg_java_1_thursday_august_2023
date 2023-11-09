package students.nikolajs_antonovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinNumber {
    public static void main(String[] args) {

        int[] array = new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Max number is: " + minNumber);
    }
}
