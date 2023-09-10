package students.artjom_ossipov.lesson_4.level_2.Task_5;

import java.util.Scanner;

public class Task_5 {
    public static void main (String [] args){
        System.out.println("Пожалуйста, введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int secondNum = scanner1.nextInt();
        if (secondNum > firstNum){
            System.out.println("Наибольшее число " + secondNum);
        }else if (secondNum < firstNum){
            System.out.println("Наибольшее число " + firstNum);
        }else {
            System.out.println("Числа " + firstNum + " и " + secondNum + " равны!");
        }

    }
}
