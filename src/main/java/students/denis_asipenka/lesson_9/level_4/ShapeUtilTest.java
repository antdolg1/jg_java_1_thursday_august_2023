package students.denis_asipenka.lesson_9.level_4;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        double result = 139.36513388705032;
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Square("Square", 5);
        shapes[2] = new Rectangle("Rectangle", 5, 5);
        shapes[3] = new Triangle("Triangle", 5);
        checkTestResult(shapeUtil.calculateArea(shapes) == result, "Тест на сумму площадей всех фигур : ");

    }

    void calculatePerimeterTest() {
        double result = 86.41592653589794;
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Square("Square", 5);
        shapes[2] = new Rectangle("Rectangle", 5, 5);
        shapes[3] = new Triangle("Triangle", 5);
        checkTestResult(shapeUtil.calculatePerimeter(shapes) == result, "Тест на сумму периметров всех фигур : ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}