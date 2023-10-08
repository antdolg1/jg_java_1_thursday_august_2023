package students.aleksandrs_kunicins.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.print("Ввдеите первое число : ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.print("Ввдеите второе число : ");
        int secondNUmber = sc.nextInt();

        if (firstNumber == secondNUmber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
        sc.close();
    }
}
