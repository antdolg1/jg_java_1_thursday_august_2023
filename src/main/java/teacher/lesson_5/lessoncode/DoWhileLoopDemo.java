package teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int userInputValue;

        do {
            System.out.println("Пожалуйста введите число от 1 до 100:");
            userInputValue = scanner.nextInt();
        } while (userInputValue != 7);

        System.out.println("Получили 7!!!");

//        do {
//            System.out.println("Значение счётчика равно " + count);
//            count++;
//        } while (count < 11);


    }
}
