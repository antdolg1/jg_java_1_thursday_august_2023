package students.aleksandrs_kunicins.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.print("Введите первое число : ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.print("Введите второе число : ");
        int secondNumber = sc.nextInt();
        System.out.print("Введите третье число : ");
        int thirdNumber = sc.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
        sc.close();
    }
}
