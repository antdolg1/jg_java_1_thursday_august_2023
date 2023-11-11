package students.emilija_ostasevska.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if(num1 - num2 > 0){
            System.out.print(num2);
        } else {
            System.out.print(num1);
        }

        scanner.close();
    }
}
