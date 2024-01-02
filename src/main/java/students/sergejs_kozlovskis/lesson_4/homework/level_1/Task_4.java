package students.sergejs_kozlovskis.lesson_4.homework.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите число : ");
        int number = scanner.nextInt();
        number = number % 2;
        if (number == 0)
            System.out.println(" Число - чётное!");
        else
            System.out.println(" Число - нечётное!");

    }
}