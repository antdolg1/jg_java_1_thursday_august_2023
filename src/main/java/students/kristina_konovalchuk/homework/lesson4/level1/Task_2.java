package students.kristina_konovalchuk.homework.lesson4.level1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");

        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");

        }
        else {
            System.out.println("Число равно нулю.");
        }

    }

}
