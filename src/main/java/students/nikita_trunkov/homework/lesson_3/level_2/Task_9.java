package students.nikita_trunkov.homework.lesson_3.level_2;
import java.util.Scanner;
 class Task_9 {
    public static void main (String [] args) {
        System.out.print("Please enter your username: ");
        Scanner scanner = new Scanner (System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "! Glad to see you!");
    }
}
