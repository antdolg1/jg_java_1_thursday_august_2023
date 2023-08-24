package students.sergejs_kozlovskis.lesson_2.homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите первое число : ");
        int number1 = scanner.nextInt();
        System.out.println("Видите второе число : ");
        int number2 = scanner.nextInt();
        System.out.println("Результат сложения :"+ (number1 + number2));
        System.out.println("Результат вычитания :"+ (number1 - number2));
        System.out.println("Результат деления :"+(number1 / number2));
        System.out.println("Остаток от деления :"+ (number1 % number2));
        System.out.println("Результат умножения :"+ (number1 * number2));
    }
}
