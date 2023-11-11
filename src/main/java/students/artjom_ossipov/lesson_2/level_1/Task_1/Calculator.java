package students.artjom_ossipov.lesson_2.level_1.Task_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Пожалуйста, введите два целых числа для выполнения математических операций");
        System.out.println("Введите первое число");
        Scanner chislo = new Scanner(System.in);
        int firstNum = chislo.nextInt();
        System.out.println("Введите второе число");
        int secondNum = chislo.nextInt();

        System.out.println("Сумма двух чисел = " + (firstNum + secondNum));
        System.out.println("Разность двух чисел = " + (firstNum - secondNum));
        System.out.println("Произведение двух чисел = " + (firstNum * secondNum));
        if (secondNum == 0) {
            System.out.println("На ноль не делим :) ");
        }
        else {
            double a = (double)firstNum/secondNum;
            System.out.println("Частное двух чисел = " + a);
        }
    }
}
