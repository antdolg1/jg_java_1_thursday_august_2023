package students.julija_pilenkova.homework.lesson_3.level_7.Task_30;

class Circle {

    double radius;
    double pi = Math.PI;

    double calculateArea(double radius){
        this.radius = radius;
        this.pi = pi;
        return (Math.PI * (radius*radius));
    }


}

class CircleDemo {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        double area = myCircle.calculateArea(45);
        System.out.println("Area is: " + area );




    }

}
