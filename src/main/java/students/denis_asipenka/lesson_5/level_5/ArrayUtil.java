package students.denis_asipenka.lesson_5.level_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
    public int createArrayRandom() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int length = (int) ((Math.random() * range) + min);
        return length;
    }

    public int[] getNumberUser(int[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Введите значение элемента массива:");
            arrays[i] = scanner.nextInt();
        }
        return arrays;
    }

    public int getLengthArraysUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        return scanner.nextInt();
    }

    public int[] createArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        return numbers;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range) + min;
        }
        return array;
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];

    }

    public int[] evenElement(int[] array) {
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newLength += 1;
            }
        }
        int j = 0;
        int[] arraysEven = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arraysEven[j] = array[i];
                j++;
            }
        }
        return arraysEven;
    }

    public int[] oddElement(int[] array) {
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newLength += 1;
            }
        }
        int j = 0;
        int[] arraysEven = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arraysEven[j] = array[i];
                j++;
            }
        }
        return arraysEven;
    }

}

