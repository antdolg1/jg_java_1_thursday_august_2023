package students.artjom_ossipov.lesson_3.Level_2.Task_9;

import java.util.Scanner;

public class Task_9 {
    public static void main (String [] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");
    }
}
