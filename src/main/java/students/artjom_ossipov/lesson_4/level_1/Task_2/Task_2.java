package students.artjom_ossipov.lesson_4.level_1.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args){
        System.out.println("Пожалуйста, введите целое число");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        if (firstNum < 0) {
            System.out.println("Введенное число " + firstNum + " отрицательное");
        } else if (firstNum > 0){
            System.out.println("Введенное число " + firstNum + " положительное");
        } else {
            System.out.println("Введенное число " + firstNum + " равно нулю");
        }
    }
}
