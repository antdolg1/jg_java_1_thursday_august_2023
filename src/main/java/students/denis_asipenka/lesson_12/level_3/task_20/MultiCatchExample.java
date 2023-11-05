package students.denis_asipenka.lesson_12.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
        } catch (
                Exception e) { // нет смысла писать ArithmeticException, Exception перехватывает все исключения, нет смысла по отдельности перехватывать
            {
            }
        }
    }
}