package students.valeriia_holovan.lesson_4.level_1.task_2;

import java.util.Scanner;
public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число : ");

        if (sc.hasNextInt()) { // проверка целочисленности с помощью hasNextInt
            int number1 = sc.nextInt();
            System.out.println("Вы ввели целое число : " + number1);
            //проверка число есть 0 или нет
            if (number1 == 0) {
                 System.out.println("Введенное число равно нулю.");
            }
        } else {
            String input = sc.next();
            System.out.println("Вы ввели нецелочисленное значение.Пожалуйста, повторите попытку снова: ");
            sc.next();
        }
    }
}