package students.artjom_ossipov.lesson_2.level_2.Task_8;

import java.util.Scanner;

public class Hello {
    public static void main (String [] args){
        System.out.println("Напишите Ваше имя!");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
// работает :)