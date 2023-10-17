package students.nikolajs_antonovs.lesson_5.level_5_6;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        if (arrayLength <= 0) {
            System.out.println("You want to create an impossible array!");
            ;
        }
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] numbers) {
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
