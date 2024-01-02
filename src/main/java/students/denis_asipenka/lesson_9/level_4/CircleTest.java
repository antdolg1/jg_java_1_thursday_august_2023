package students.denis_asipenka.lesson_9.level_4;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculatePerimeterTest();
        test.calculateAreaTest();
    }

    void calculateAreaTest() {
        double result = 19.634954084936208;
        Circle circle = new Circle("Perimeter", 2.5);
        checkTestResult(circle.calculateArea() == result,
                "Тест на нахождение площади окружности: ");
    }

    void calculatePerimeterTest() {
        double result = 15.707963267948966;
        Circle circle = new Circle("Area", 2.5);
        System.out.println(circle.calculatePerimeter());
        checkTestResult(circle.calculatePerimeter() == result,
                "Тест на нахождение периметра окружности: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}