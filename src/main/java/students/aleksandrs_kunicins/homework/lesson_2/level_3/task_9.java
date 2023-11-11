package students.aleksandrs_kunicins.homework.lesson_2.level_3;
import java.util.Scanner; //Добавляем библиотеку, чтобы считать данные
public class task_9 {
    public static void main(String [] args){
        System.out.println("Введите число : "); //Просим ввести число
        Scanner scanner = new Scanner(System.in);//Создаём объект, который будет использоваться для чтении числа с пользователя
        int userNumber = scanner.nextInt();//Объявляем переменную для хранения числа
        for(int number = 1; number<11;number++){ //Создаём цикл, потому что мне лень прописывать каждую строчку
            System.out.println(userNumber + " X " + number + " = " + (number*userNumber)); //Выводим числа
        }
        scanner.close();
    }
}
