package students.anastassia_iljina.lesson_2;

import java.util.Scanner;

public class Calculator_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое вещественное число: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе вещественное число: ");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Сумма вещественных чисел: " + sum);
        System.out.println("Вычитание чисел: " + subtraction);
        System.out.println("Умножение чисел: " + multiplication);
        System.out.println("Деление чисел: " + division);

    }
}
