package students.aleksandrs_kunicins.homework.lesson_2.level_1; 
import java.util.Scanner; //Импортируем библиотеку, которая помогает брать данные у пользователя

class Task_1{  //Создаю класс с нужным имнем 
    public static void main(String[] args) {
        System.out.println("Введите первое целое число : "); //Просим пользователя ввести число
        Scanner userData1 = new Scanner(System.in); // Создаём объект, который будет использоваться для чтении инфы с пользователя
        int firstNumber = userData1.nextInt(); // Создаём переменную, в которую запихиваем первое введённое число пользователя
        System.out.println("Введите Второе целое число : "); //Просим пользователя ввести число
        Scanner userData2 = new Scanner(System.in); // Создаём объект, который будет использоваться для чтении инфы с пользователя
        int secondNumber = userData2.nextInt(); // Создаём переменную, в которую запихиваем второе введённое число пользователя
        System.out.println("Результат сложение двух чисел : "+(firstNumber + secondNumber)); //Выписываем результат сложения
        System.out.println("Результат разности двух чисел : "+(firstNumber-secondNumber)); //Выписываем результат вычетания
        System.out.println("Результат умножения двух чисел : "+(firstNumber*secondNumber)); //Выписываем результат умножения
        if (secondNumber==0){ //Создаём условие, так как может возникунуть ошибку, если пользователь введёт 0 вторым числом
            System.out.println("Результат деления двух чисел : неопределён"); //Выписываем результат деления при условии если второе число 0
        }else{
            System.out.println("Результат деления двух чисел : "+(firstNumber/secondNumber)); //Выписываем результат деления, если всё хорошо
        }
        userData1.close();
        userData2.close();
    }
}
