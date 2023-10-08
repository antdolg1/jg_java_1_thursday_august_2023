package students.anastassia_iljina.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье целое число: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
