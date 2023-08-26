package students.aleksandrs_kunicins.homework.lesson_3.level_7;

class Circle{
    double radius;
    double pi = Math.PI;

    double calculateArea(double radius){
        this.radius = radius;
        pi = Math.PI;
        return (2*pi*radius);
    };
}
class CicleDemo{
    public static void main(String[] args) {
        Circle area = new Circle();
        double circleArea = area.calculateArea(12.5);
        System.out.println("Circle area is " + circleArea);
    }
}