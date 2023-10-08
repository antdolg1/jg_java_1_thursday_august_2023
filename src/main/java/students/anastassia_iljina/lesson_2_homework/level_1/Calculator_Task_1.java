package students.anastassia_iljina.lesson_2_homework.level_1;

import java.util.Scanner;

public class Calculator_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Результат сложения: " + sum);
        System.out.println("Результат вычитания: " + subtraction);
        System.out.println("Результат умножения: " + multiplication);
        System.out.println("Результат деления: " + division);



    }
}
