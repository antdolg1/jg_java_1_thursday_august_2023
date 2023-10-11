package students.anastassia_iljina.lesson_3.homework.level_7.task_30;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
