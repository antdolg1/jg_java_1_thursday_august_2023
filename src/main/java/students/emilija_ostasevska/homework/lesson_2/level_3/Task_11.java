package students.emilija_ostasevska.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        System.out.println("Среднее: " + ((num1 + num2 + num3) / 3));
        
        scanner.close();
    }
}