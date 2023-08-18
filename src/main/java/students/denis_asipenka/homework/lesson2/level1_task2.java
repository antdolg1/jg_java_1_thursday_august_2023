package students.denis_asipenka.homework.lesson2;

import java.util.Scanner;

public class level1_task2 {
    public static void main(String[] args) {
        // Scanner ol = new Scanner(System.in);
        System.out.println("Введите число:");
        Scanner cislo = new Scanner(System.in);
        double firstNumber = cislo.nextDouble();
        System.out.println("Введите число:");
        double numbertwo = cislo.nextDouble();



        double sum = firstNumber + numbertwo;
        System.out.println("Результат сложения:");
        System.out.println(sum);
        double subtraction = firstNumber - numbertwo;
        System.out.println("Результат вычетания:");
        System.out.println(subtraction);
        double multiplication = firstNumber * numbertwo;
        System.out.println("Результат умножения:");
        System.out.println(multiplication);
        System.out.println("Результат деления:");
        double division = firstNumber / numbertwo;
        System.out.println(division);
    }
}
