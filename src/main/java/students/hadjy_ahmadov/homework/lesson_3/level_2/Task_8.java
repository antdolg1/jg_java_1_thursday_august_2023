package students.hadjy_ahmadov.homework.lesson_3.level_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        scanner.close();
    }

}
