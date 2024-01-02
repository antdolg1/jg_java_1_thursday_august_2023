package students.emilija_ostasevska.homework.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        
        System.out.print("1: ");
        numbers[0] = scanner.nextInt();
        System.out.print("2: ");
        numbers[1] = scanner.nextInt();
        System.out.print("3: ");
        numbers[2] = scanner.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        scanner.close();
    }
}
