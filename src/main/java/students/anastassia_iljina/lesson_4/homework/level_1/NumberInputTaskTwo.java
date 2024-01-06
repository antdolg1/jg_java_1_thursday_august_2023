package students.anastassia_iljina.lesson_4.homework.level_1;

import java.util.Scanner;

public class NumberInputTaskTwo {
    public static void main(String[] args) {

        System.out.println("Введите целое число: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Число равно нулю");
        } else if (number > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
}
