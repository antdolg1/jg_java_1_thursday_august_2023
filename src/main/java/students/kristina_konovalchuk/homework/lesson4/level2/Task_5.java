package students.kristina_konovalchuk.homework.lesson4.level2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();
        if (number1 > number2){
            System.out.println("Наименьшее число:" + number1);
        } else if (number2 > number1) {
            System.out.println("Наименьшее число:" + number2);

        }
        else {
            System.out.println("Числа равны!");
        }
    }
}
