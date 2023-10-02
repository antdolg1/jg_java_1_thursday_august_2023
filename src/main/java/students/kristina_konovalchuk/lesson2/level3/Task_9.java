package students.kristina_konovalchuk.lesson2.level3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило первое число : ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число : ");
        int num2 = scanner.nextInt();
        if (num1 + num2 > 10) {
            System.out.println("Число должно быть меньше 10 ! ");


        } else {
            int result = num1 * num2;
            System.out.println("Результат :" + result);
        }
    }


}
