package students.denis_asipenka.lesson_9.level_4;

public class Triangle extends Shape {
    Triangle(String title) {
        super(title);
    }

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    double side;

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}