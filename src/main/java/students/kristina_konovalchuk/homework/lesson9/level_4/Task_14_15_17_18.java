package students.kristina_konovalchuk.homework.lesson9.level_4;

public class Task_14_15_17_18 {
    abstract class Shape {
        private String title;

        Shape(String title) {
            this.title = title;
        }

        abstract double calculateArea();

        abstract double calculatePerimeter();

        abstract double CalculateArea();

        abstract double CalculatePerimeter();
    }

    public abstract class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            super( "Circle" );
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * Math.pow( radius, 2 );
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    abstract class Square extends Shape {
        private double side;

        Square(double side) {
            super( "Square" );
            this.side = side;

        }

        @Override
        double calculateArea() {
            return Math.pow( side, 2 );
        }

        @Override
        double calculatePerimeter() {
            return 4 * side;
        }
    }

    abstract class Rectangle extends Shape {
        private double wight;
        private double height;

        public Rectangle(double wight, double height) {
            super( "Rectangle" );
            this.height = height;
            this.wight = wight;
        }

        @Override
        double calculateArea() {
            return wight * height;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (wight + height);
        }
    }

    abstract class Triangle extends Shape {
        private double side;

        public Triangle(double side) {
            super( "Triangle" );
            this.side = side;
        }

        @Override
        double calculateArea() {

            return (Math.sqrt( 3 / 4 ) * Math.pow( side, 2 ));
        }

        @Override
        double calculatePerimeter() {

            return 3 * side;
        }
    }


