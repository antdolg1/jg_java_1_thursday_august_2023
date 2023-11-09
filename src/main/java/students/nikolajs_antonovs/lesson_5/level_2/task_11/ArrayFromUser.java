package students.nikolajs_antonovs.lesson_5.level_2.task_11;

import java.util.Scanner;
import java.util.Arrays;

class ArrayFromUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Please, enter second number: ");
        int thirdNumber = scanner.nextInt();

        int array[] = {firstNumber, secondNumber, thirdNumber};
        System.out.println();
        System.out.println("Array " + Arrays.toString(array));
    }
}