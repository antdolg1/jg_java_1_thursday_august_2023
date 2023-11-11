package students.denis_asipenka.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое отрацительное или положительное число:");
        int b = scanner.nextInt();
        if (b < 0) {
            System.out.println("Число отрицательное");
        } else if (b > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}
