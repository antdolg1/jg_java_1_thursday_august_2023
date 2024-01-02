package students.kristina_konovalchuk.homework.lesson4.level3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();
        int max = number1;
        if (number2 > max){
            max = number2;
        }if (number3 > max){
            max = number3;
        }
        System.out.println("Наибольшее число: " + max);
    }
}
