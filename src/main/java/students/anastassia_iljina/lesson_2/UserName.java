package students.anastassia_iljina.lesson_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
