package students.sergejs_kozlovskis.lesson_2.homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите первое число : ");
        double number1 = scanner.nextDouble();
        System.out.println("Видите второе число : ");
        double number2 = scanner.nextDouble();
        System.out.println("Результат сложения :"+ (number1 + number2));
        System.out.println("Результат вычитания :"+ (number1 - number2));
        System.out.println("Результат деления :"+(number1 / number2));
        System.out.println("Остаток от деления :"+ (number1 % number2));
        System.out.println("Результат умножения :"+ (number1 * number2));
    }
}
