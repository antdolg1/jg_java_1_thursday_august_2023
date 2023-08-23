package students.aleksandrs_kunicins.homework.lesson_2.level_3;
import java.util.Scanner;
public class task_11 {
    public static void main(String[]args){
    System.out.println("Введите первое число : "); //Просим число 
    Scanner first_scanner = new Scanner(System.in);//Создаём объект, который будет использоваться для чтении числа с пользователя
    double firstNUmber = first_scanner.nextDouble();//Объявляем переменную для хранения числа
    System.out.println("Введите второе число : "); //Просим число 
    Scanner second_scanner = new Scanner(System.in);//Создаём объект, который будет использоваться для чтении числа с пользователя
    double secondNUmber = second_scanner.nextDouble();//Объявляем переменную для хранения числа
    System.out.println("Введите третье число : "); //Просим число 
    Scanner third_scanner = new Scanner(System.in);//Создаём объект, который будет использоваться для чтении числа с пользователя
    double thirdNumber = second_scanner.nextDouble();//Объявляем переменную для хранения числа
    System.out.println("Среднее арефметическое : " + (firstNUmber+secondNUmber+thirdNumber)/3);//Выводим результат
    }
}
