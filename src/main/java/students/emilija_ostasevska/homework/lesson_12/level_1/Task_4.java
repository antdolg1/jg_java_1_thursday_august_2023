package students.emilija_ostasevska.homework.lesson_12.level_1;

public class Task_4 {
    class MyException extends Exception {

        public MyException(String message) {
            // Передача сообщения об ошибке в конструктор родительского класса
            super(message);
        }
    }
}
