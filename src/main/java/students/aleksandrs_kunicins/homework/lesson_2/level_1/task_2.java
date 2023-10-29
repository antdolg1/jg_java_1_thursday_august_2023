package students.aleksandrs_kunicins.homework.lesson_2.level_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число : "); //Просим пользователя ввести число
        Scanner userData1 = new Scanner(System.in); // Создаём объект, который будет использоваться для чтении инфы с пользователя
        Scanner userData2 = new Scanner(System.in); // Создаём объект, который будет использоваться для чтении инфы с пользователя
        double firstDoubleNumber = userData1.nextDouble(); // Создаём переменную, в которую запихиваем первое введённое число пользователя
        int secondDoubleNumber = userData2.nextInt(); // Создаём переменную, в которую запихиваем второе введённое число пользователя
        System.out.println("Результат сложение двух чисел : "+(firstDoubleNumber + secondDoubleNumber)); //Выписываем результат сложения
        System.out.println("Результат разности двух чисел : "+(firstDoubleNumber-secondDoubleNumber)); //Выписываем результат вычетания
        System.out.println("Результат умножения двух чисел : "+(firstDoubleNumber*secondDoubleNumber)); //Выписываем результат умножения
        if (secondDoubleNumber==0){ //Создаём условие, так как может возникунуть ошибку, если пользователь введёт 0 вторым числом
            System.out.println("Результат деления двух чисел : неопределён"); //Выписываем результат деления при условии если второе число 0
        }else{
            System.out.println("Результат деления двух чисел : "+(firstDoubleNumber/secondDoubleNumber)); //Выписываем результат деления, если всё хорошо
        }
        userData1.close();
        userData2.close();
    }
}
