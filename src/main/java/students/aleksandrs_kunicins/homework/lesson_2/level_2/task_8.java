package students.aleksandrs_kunicins.homework.lesson_2.level_2;
import java.util.Scanner; //Импортируем библиотку которая позволяет нас считать данные, которые вводит пользователь
public class task_8 {
    public static void main(String[] args){
        System.out.println("Введите Ваше имя"); //Просим ввести имя
        Scanner scanner = new Scanner(System.in); //Создаём объект, который будет использоваться для чтении инфы с пользователя
        String userName = scanner.nextLine();// Создаём переменную, в которой мы будем хранить имя
        System.out.println("Hello " + userName + "!"); //Выводим результат
        scanner.close();
    }
}
