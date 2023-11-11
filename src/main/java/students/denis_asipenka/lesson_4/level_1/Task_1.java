package students.denis_asipenka.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое отрацительное или положительное число:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else System.out.println("Число положительное");
    }

}
