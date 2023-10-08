package students.aleksandrs_kunicins.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.print("Введите число : ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.print("Введите число : ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Наименьшее число : " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Наименьшее число : " + firstNumber);
        } else {
            System.out.println("Try again, javaGuruError");
        }
        sc.close();
    }
}
