package students.nikolajs_antonovs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Negative number!");
        } else {
            System.out.println("Positive number!");
        }

    }
}
