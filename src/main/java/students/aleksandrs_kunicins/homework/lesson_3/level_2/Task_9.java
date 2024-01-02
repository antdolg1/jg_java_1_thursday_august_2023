package students.aleksandrs_kunicins.homework.lesson_3.level_2;
import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        System.out.print("Введите своё имя : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+ name + "!");
        scanner.close();

    }
}
