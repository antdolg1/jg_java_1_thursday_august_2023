package teacher.lesson_14.lessoncode.tdd;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers!");
        }

        if (number == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
