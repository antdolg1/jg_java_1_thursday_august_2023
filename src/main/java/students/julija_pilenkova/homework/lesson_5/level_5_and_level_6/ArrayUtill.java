package students.julija_pilenkova.homework.lesson_5.level_5_and_level_6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtill {
    public int[] array(int arrayLength) {
        return new int[arrayLength];
    }

    public int arrayFromUser(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, fill array length: ");
        arrayLength = scanner.nextInt();
        return arrayLength;
    }

    public void fillArraysWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(Arrays.toString(array));
            break;
        }
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

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];

            }

        }
        return maxNumber;
    }
}
