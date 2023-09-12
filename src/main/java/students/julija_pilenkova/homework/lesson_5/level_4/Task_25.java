package students.julija_pilenkova.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number for Array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Insert array elements: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
