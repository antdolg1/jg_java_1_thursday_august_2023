package students.anastassia_iljina.lesson_4.homework.level_2;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
