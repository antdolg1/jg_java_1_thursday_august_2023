package students.artjom_ossipov.lesson_5.level_2.task_11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, напишите первое целое число");
        int first = scanner.nextInt();
        System.out.println("Пожалуйста, напишите второе целое число");
        int second = scanner.nextInt();
        System.out.println("Пожалуйста, напишите третье целое число");
        int third = scanner.nextInt();
        int[] numbers = new int[] {first, second, third};
        for (int i=0; i<3; i++){
            System.out.println(numbers[i]);
        }
    }
}
