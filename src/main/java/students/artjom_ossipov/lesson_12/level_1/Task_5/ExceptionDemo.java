package students.artjom_ossipov.lesson_12.level_1.Task_5;

public class ExceptionDemo extends Throwable {
    Exception exception = new Exception();
    Throwable throwable = new Throwable();

    public static void main(String[] args) {
        try {
            int result = 10/0;
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
