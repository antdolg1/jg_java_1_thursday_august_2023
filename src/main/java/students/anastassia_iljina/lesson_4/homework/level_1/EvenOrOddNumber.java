package students.anastassia_iljina.lesson_4.homework.level_1;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

    }
}
