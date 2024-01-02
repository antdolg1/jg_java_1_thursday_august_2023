package students.denis_asipenka.lesson_9.level_4;

public class Circle extends Shape {
    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    private double radius;
//    private double areaCircle;
//
//    private double perimeterCircle;

    @Override
    double calculateArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    double calculatePerimeter() {
        return ((2 * Math.PI) * radius);
    }
}