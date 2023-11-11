package students.emilija_ostasevska.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.print("All numbers are equal");
        } else if(num1 != num2 && num2 != num3 && num1 != num3){
            System.out.print("All numbers are different");
        } else {
            System.out.print("Neither all are equal or different");
        }

        scanner.close();
    }
}