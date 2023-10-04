package students.nikolajs_antonovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class ArrayFromUser {

    public static void main(String[] args) {

        System.out.print("Please, enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int userArrayLength = scanner.nextInt();
        int[] array = new int[userArrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for array element with index " + i + " - ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array " + Arrays.toString(array));
    }
}
