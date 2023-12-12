package students.artjom_ossipov.lesson_4.level_2.Task_6;

import java.util.Scanner;

public class Task_6 {
    public static void main (String [] args){
        System.out.println("Пожалуйста, введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (secondNum < firstNum){
            System.out.println("Наименьшее число " + secondNum);
        }else if (secondNum > firstNum){
            System.out.println("Наименьшее число " + firstNum);
        }else {
            System.out.println("Числа " + firstNum + " и " + secondNum + " равны!");
        }

    }
}
