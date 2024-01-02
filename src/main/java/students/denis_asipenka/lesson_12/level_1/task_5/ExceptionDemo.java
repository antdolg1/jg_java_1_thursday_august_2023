package students.denis_asipenka.lesson_12.level_1.task_5;

public class ExceptionDemo extends Throwable {
    Exception exception = new Exception();
    Throwable throwable = new Throwable();

    public static void main(String[] args) {
        try {
            int result = 1 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public class CustomEx extends Exception {
        public CustomEx(String message) {
            super(message);
        }

    }
}