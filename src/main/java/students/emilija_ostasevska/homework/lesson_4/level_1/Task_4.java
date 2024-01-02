package students.emilija_ostasevska.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.print("Ваше чисто четное");
        } else {
            System.out.print("Ваше чисто нечетное");
        }

        scanner.close();
    }
}
