package students.valeriia_holovan.lesson_4.level_1.task_4;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Please input number :");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int number = inputNumber;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        String result = (number % 2 == 0) ? "Чётное" : "Нечётное";

        System.out.println(result);
        System.out.println("Using Ternary Operator: " + result);
    }
}