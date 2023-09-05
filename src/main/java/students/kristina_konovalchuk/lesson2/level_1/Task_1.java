package students.kristina_konovalchuk.lesson2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(System[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Ввелите второе число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication =  firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;

        System.out.println("Сложение :" + sum);
        System.out.println("Вычитание :" + subtraction);
        System.out.println("Умножение :" + multiplication);
        System.out.println("Деление :" + division);
    }
}
