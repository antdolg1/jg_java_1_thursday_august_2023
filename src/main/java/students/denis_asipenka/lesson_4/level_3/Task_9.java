package students.denis_asipenka.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int thirdNumber = scanner.nextInt();
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber)
            System.out.println("decreasing");
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
