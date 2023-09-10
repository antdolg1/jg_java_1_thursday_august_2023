package students.artjom_ossipov.lesson_4.level_1.Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args){
        System.out.println("Пожалуйста, введите целое число");
        Scanner scanner = new Scanner(System.in);
        int goodNum = scanner.nextInt();
        if (goodNum % 2 == 0) {
            System.out.println("Вы ввели четное число " + goodNum);
        } else {
            System.out.println("Вы ввели нечетное число " + goodNum);
        }
    }
}
