package teacher.lesson_12.lessoncode;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        TryCatchFinallyExample demo = new TryCatchFinallyExample();
        try {
            demo.printLength(null);
            demo.division(8, 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Cannot divide by zero");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Cannot print length of null!");
        }
    }

    public void division(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        } else {
            System.out.println("Result: " + (number1 / number2));
        }
    }

    public void printLength(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("String is null!");
        } else {
            System.out.println("String length: " + s.length());
        }
    }
}
