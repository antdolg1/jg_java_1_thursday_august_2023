package students.emilija_ostasevska.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        if(num1 <= num2 && num2 < num3){
            System.out.print(num3);
        } else if(num1 > num2 && num2 >= num3){
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

        scanner.close();
    }
}
