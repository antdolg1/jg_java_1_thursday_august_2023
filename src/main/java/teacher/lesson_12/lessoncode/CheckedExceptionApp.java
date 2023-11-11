package teacher.lesson_12.lessoncode;

public class CheckedExceptionApp {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");
            shouldThrowException();
        } catch (Exception e) {
            System.out.println("Inside catch block");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void shouldThrowException() throws Exception {
        throw new Exception("Some exception was thrown!");
    }
}
