package students.nikolajs_antonovs.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class ArrayDoubleNumbers {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array elements: " + Arrays.toString(array));
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println("x2 of number: " + Arrays.toString(array));
    }
}

