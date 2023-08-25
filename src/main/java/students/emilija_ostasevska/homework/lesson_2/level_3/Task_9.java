package students.emilija_ostasevska.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
