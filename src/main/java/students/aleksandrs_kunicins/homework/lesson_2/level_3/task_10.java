package students.aleksandrs_kunicins.homework.lesson_2.level_3;
import java.util.Scanner;
public class task_10 {
    public static void main(String [] args){
        System.out.println("Введите радиус : "); //Просим ввести радиус
        Scanner scanner = new Scanner(System.in);//Создаём объект, который будет использоваться для чтении числа с пользователя
        double radius = scanner.nextDouble();//Объявляем переменную для хранения числа
        System.out.println("Perimeter is = " + (2*Math.PI*radius)); //Используя метод для расчётвов выводим периметр 
        System.out.println("Area is = " + (Math.PI*radius*radius));//Используя метод для расчётвов выводим площадь  
        
        scanner.close();

    }
}
