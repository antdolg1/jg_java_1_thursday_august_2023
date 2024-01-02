package students.emilija_ostasevska.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.print("Ваше чисто положительное :)");
        } else if(num < 0){
            System.out.print("Ваше чисто отрицательное :(");
        } else {
            System.out.print("А это нолик :()");
        }

        scanner.close();
    }
}
