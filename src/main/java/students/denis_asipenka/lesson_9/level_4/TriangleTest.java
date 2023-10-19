package students.denis_asipenka.lesson_9.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculatePerimeterTest();
        test.calculateAreaTestTest();
    }

    void calculatePerimeterTest() {
        double result = 34.5;
        Triangle triangle = new Triangle("Triangle", 11.5);
        checkTestResult(triangle.calculatePerimeter() == result, "Тест на нахождение периметра равностороннего треугольника: ");
    }

    void calculateAreaTestTest() {
        double result = 47.739650383617175;
        Triangle triangle = new Triangle("Triangle", 10.5);
        checkTestResult(triangle.calculateArea() == result, "Тест на нахождение площади равностороннего треугольника: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}