package students.artjom_ossipov.lesson_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        System.out.println("Пожалуйста, введите два целых числа для выполнения математических операций");
        System.out.println("Введите первое число");
        Scanner chislo = new Scanner(System.in);
        int firstNum = chislo.nextInt();
        System.out.println("Введите второе число");
        Scanner chislo2 = new Scanner(System.in);
        int secondNum = chislo2.nextInt();

        System.out.println("Сумма двух чисел = " + (firstNum + secondNum));
        System.out.println("Разность двух чисел = " + (firstNum - secondNum));
        System.out.println("Произведение двух чисел = " + (firstNum * secondNum));
        double a = (double)firstNum/secondNum;
        if (secondNum == 0) {
            System.out.println("На ноль не делим :) ");
        }
        else {
        System.out.println("Частное двух чисел = " + a);
        }
    }
}
