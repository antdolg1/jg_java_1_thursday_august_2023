package students.nikolajs_antonovs.lesson_2.level_2.task_8;

import java.util.Scanner;
public class Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name!");
        String name = scanner.next();
        System.out.println("-----");
        System.out.println("Hello " + name);
    }
}
