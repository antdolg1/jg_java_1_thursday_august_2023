package students.anastassia_iljina.lesson_5.homework.level_5_6;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        if (arrayLength <= 0) {
            return null;
        }
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        if (array == null) {
            return;
        }
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        if (array == null) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }


}
