package students.kristina_konovalchuk.lesson2.level3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Напишите первое число: ");
        int number1 = input.nextInt();

        System.out.println("Напишите второе число: ");
        int number2 = input.nextInt();

        System.out.println("Напишите третье число: ");
        int number3 = input.nextInt();

        double avarage = (number1 + number2 + number3) / 3;

        System.out.println("Результат :" + number1 + number2 + number3 + avarage);
    }
}
