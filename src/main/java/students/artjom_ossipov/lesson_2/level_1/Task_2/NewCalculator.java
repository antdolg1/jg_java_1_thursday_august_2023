package students.artjom_ossipov.lesson_2.level_1.Task_2;

import java.util.Scanner;
public class NewCalculator {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите два вещественных числа для выполнения математических операций");
        System.out.println ("Введите первое число");
        Scanner chislo = new Scanner(System.in);
        double firstNum = chislo.nextDouble();
        System.out.println ("Введите второе число");
        Scanner chislo2 = new Scanner(System.in);
        double secondNum = chislo2.nextDouble();

        System.out.println("Сумма двух чисел = " + (firstNum + secondNum));
        System.out.println("Разность двух чисел = " + (firstNum - secondNum));
        System.out.println("Произведение двух чисел = " + (firstNum * secondNum));
        if (secondNum == 0) {
            System.out.println("На ноль не делим :) ");
        }
        else {
            System.out.println("Частное двух чисел = " + (firstNum / secondNum));
        }
    }
}