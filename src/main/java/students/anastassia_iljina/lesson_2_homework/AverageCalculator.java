package students.anastassia_iljina.lesson_2_homework;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int firstName = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите третье целое число: ");
        int thirdNumber = scanner.nextInt();

        int sumResult = firstName + secondNumber + thirdNumber;
        int amount = 3;

        double averageResult = sumResult / amount;

        System.out.println("Среднее арифмитическое составляет: " + averageResult);

    }
}
