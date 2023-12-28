package students.denis_asipenka.lesson_9.level_4;

public class Square extends Shape {
    public Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    public double sideLength;

    Square(String title) {
        super(title);
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength + sideLength + sideLength + sideLength;
    }
}