package students.emilija_ostasevska.homework.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");

        scanner.close();
    }

}
