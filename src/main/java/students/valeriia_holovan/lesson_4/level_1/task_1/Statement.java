package students.valeriia_holovan.lesson_4.level_1.task_1;
import teacher.lesson_4.lessoncode.IfElseStatement;

import java.util.Scanner;
public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число : ");

        if (sc.hasNextInt()) { // проверка целочисленности с помощью hasNextInt
            int number1 = sc.nextInt();
            System.out.println("Вы ввели целое число : " + number1);
        } else {
            String input = sc.next();
            System.out.println("Вы ввели нецелочисленное значение.Пожалуйста, повторите попытку снова: ");
            sc.next();
        }
    }
}