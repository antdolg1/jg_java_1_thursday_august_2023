package students.julija_pilenkova.homework.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    boolean replaceFirst(int[] array, int newNumber, int numberToReplace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                numberToReplace = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int newNumber, int numberToReplace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
        return newNumber;
    }

    void reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("You cant sort empty array!");
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temporary = array[left];
            array[left] = array[right];
            array[right] = temporary;
            left++;
            right--;
        }
    }

    void sortArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("You cant sort empty array!");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}