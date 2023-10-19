package students.denis_asipenka.lesson_9.level_4;

public class Rectangle extends Shape {
    public double lengthShape;

    public Rectangle(String title, double lengthShape, double width) {
        super(title);
        this.lengthShape = lengthShape;
        this.width = width;
    }

    public double width;

    Rectangle(String title) {
        super(title);
    }

    @Override
    double calculateArea() {
        return lengthShape * width;
    }

    @Override
    double calculatePerimeter() {
        return (lengthShape + width) * 2;
    }
}