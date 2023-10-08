package students.aleksandrs_kunicins.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.print("Введите целое число : ");
        Scanner scanner = new Scanner(System.in);
        int isEven = scanner.nextInt();
        if (isEven % 2 == 0) {
            System.out.println("Чётное число");
        } else {
            System.out.println("Нечётное число");
        }
        scanner.close();
    }
}
