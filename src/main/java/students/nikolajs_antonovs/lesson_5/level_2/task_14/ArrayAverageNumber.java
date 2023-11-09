package students.nikolajs_antonovs.lesson_5.level_2.task_14;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;

class ArrayAverageNumber {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("");
        System.out.println("Array elements: " + Arrays.toString(array));

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        String result = decimalFormat.format(average);

        System.out.println("Average number: " + result);
    }
}

