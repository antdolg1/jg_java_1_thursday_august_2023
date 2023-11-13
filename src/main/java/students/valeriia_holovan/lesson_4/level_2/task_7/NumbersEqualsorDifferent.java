package students.valeriia_holovan.lesson_4.level_2.task_7;

import java.util.Scanner;

public class NumbersEqualsorDifferent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число : ");
        int number1;

        if (sc.hasNextInt()) { // проверка целочисленности с помощью hasNextInt
            number1 = sc.nextInt();
        } else {
            String input = sc.next();
            System.out.println("Вы ввели нецелочисленное значение.Пожалуйста, повторите попытку снова: ");
            return;//что бы избежать дополнительного ввода
        }
        System.out.println("Введите второе целое число : ");
        int number2;
        if (sc.hasNextInt()) { // проверка целочисленности с помощью hasNextInt
            number2 = sc.nextInt();
        } else {
            String input = sc.next();
            System.out.println("Вы ввели нецелочисленное значение.Пожалуйста, повторите попытку снова: ");
            return;
        }
        if (number1 == number2) {
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different!");
        }
    }
}
