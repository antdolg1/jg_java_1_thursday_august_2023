package students.kristina_konovalchuk.homework.lesson9.level_4;

public class SquareTest {
    public static void main(String[]args){
        Task_14_15_17_18.Square square = new Task_14_15_17_18.Square(5);
        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();
        if (area == 25){
            System.out.println("calculateArea() test passed" );
        }else {
            System.out.println("calculateArea() test failed" );
        }
        if (perimeter == 20){
            System.out.println("calculatePerimeter() test passed" );
        }else {
            System.out.println("calculatePerimeter() test failed" );
        }

    }
}
