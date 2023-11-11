package students.nikita_trunkov.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Input second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Input third number: ");
        double number3 = scanner.nextDouble();
        System.out.println("Average number: " + ((number1 + number2 + number3)/3));
    }
}
