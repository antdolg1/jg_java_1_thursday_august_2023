package students.artjom_ossipov.lesson_4.level_2.Task_7;

import java.util.Scanner;

public class Task_7 {
    public static void main (String [] args){
        System.out.println("Пожалуйста, введите два целых числа!");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (secondNum == firstNum){
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Numbers are different");
        }
    }
}
