package students.kristina_konovalchuk.homework.lesson9.level_4;

import org.junit.Test;

public class RectangleTest {
    @Test
    public static void main(String[] args) {
        Task_14_15_17_18.Rectangle rectangle = new Task_14_15_17_18.Rectangle( 5, 10 );
        double area = rectangle.CalculateArea( );
        double perimeter = rectangle.calculatePerimeter( );
        if (area == 50) {
            System.out.println( "calculateArea() test passed" );
        } else {
            System.out.println( "calculateArea() test failed" );
        }
        if (perimeter == 30) {
            System.out.println( "calculateArea() test passed" );
        } else {
            System.out.println( "calculateArea() test failed" );
        }
    }
}
