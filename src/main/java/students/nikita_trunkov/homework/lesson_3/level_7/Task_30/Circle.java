package students.nikita_trunkov.homework.lesson_3.level_7.Task_30;

 class Circle {

  double radius;
  double PI;
   double calculateArea (double radius) {
    this.radius = radius;
    this.PI = PI;
    return (Math.PI * (radius * radius));
  }
  }


  class CircleDemo {
  public static void main (String [] args) {
  Circle circle = new Circle();
  double area = circle.calculateArea(37);
  System.out.println ("Area is: " + area);
  }
  }