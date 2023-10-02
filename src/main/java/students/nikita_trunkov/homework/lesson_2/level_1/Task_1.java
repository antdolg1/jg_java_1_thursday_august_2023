package students.nikita_trunkov.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int number1 = scanner.nextInt();
        System.out.println("Input second number");
        int number2 = scanner.nextInt();

        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));
        System.out.println("Quotient: " + (number1 / number2));
    }
}
