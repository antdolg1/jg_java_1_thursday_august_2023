package students.denis_asipenka.lesson_9.level_4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculatePerimeterTest();
        test.calculateAreaTestTest();
    }

    void calculatePerimeterTest() {
        double result = 23.12;
        Square square = new Square("Square", 5.78);
        checkTestResult(square.calculatePerimeter() == result, "Тест на нахождение периметра квадрата: ");
    }

    void calculateAreaTestTest() {
        double result = 27.878400000000003;
        Square square = new Square("Square", 5.28);
        checkTestResult(square.calculateArea() == result, "Тест на нахождение площади квадрата: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}