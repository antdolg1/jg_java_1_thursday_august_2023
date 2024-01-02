package students.kristina_konovalchuk.homework.lesson_12.level3;

public class Task_20 {
    public class MultiCatchExample {
        public static void main(String[] args) {
            try {
                //код, который может генерировать исключение
            } catch (ArithmeticException | NullPointerException e) {

            } catch (Exception e) {
                //обрабатывает любое другое исключение
            }

        }
    }
}
