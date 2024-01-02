package students.denis_asipenka.lesson_9.level_4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculatePerimeterTest();
        test.calculateAreaTestTest();

    }

    void calculatePerimeterTest() {
        double result = 202.2;
        Rectangle rectangle = new Rectangle("Rectangle", 55.55, 45.55);
        checkTestResult(rectangle.calculatePerimeter() == result, "Тест на нахождение периметра прямоугольника: ");
    }

    void calculateAreaTestTest() {
        double result = 2530.3025;
        Rectangle rectangle = new Rectangle("Rectangle", 55.55, 45.55);
        checkTestResult(rectangle.calculateArea() == result, "Тест на нахождение площади прямоугольника: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void calculatePerimeterTest(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}