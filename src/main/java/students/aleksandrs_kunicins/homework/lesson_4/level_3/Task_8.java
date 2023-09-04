package students.aleksandrs_kunicins.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.print("Введите первое число : ");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        System.out.print("Введите второе число : ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();
        System.out.print("Введите третье число : ");
        Scanner scanner3 = new Scanner(System.in);
        int thirdNumber = scanner3.nextInt();


        if (firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber){
            System.out.println("All numbers are equal");
        }else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
