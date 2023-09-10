package students.emilija_ostasevska.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.print("Numbers are equals");
        } else {
            System.out.print("Numbers are different");
        }

        scanner.close();
    }
}
