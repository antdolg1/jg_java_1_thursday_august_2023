package students.nikolajs_antonovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayFromUserRandom {

    public static void main(String[] args) {

        System.out.print("Please, note array's length: ");

        Scanner scanner = new Scanner(System.in);
        int userArrayLength = scanner.nextInt();
        int[] array = new int[userArrayLength];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array elements: " + Arrays.toString(array));
    }
}

