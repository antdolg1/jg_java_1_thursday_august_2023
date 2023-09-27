package students.nikolajs_antonovs.lesson_5.level_2.task_13;

import java.util.Arrays;
import java.util.Random;

class ArraySumNumber {
    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("");
        System.out.println("Array elements: " + Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of number: " + sum);
    }
}
