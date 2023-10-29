package students.denis_asipenka.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber)
            System.out.println("All numbers are different");
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
