package students.denis_asipenka.lesson_9.level_4;

import java.util.Random;

public class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble() + 20);
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble() + 20);
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble() + 20, random.nextDouble() + 20);
    }

    Triangle createRandomTriangle() {
        return new Triangle("Rectangle", random.nextDouble() + 20);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculateArea();
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculatePerimeter();
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}