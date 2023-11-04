package students.kristina_konovalchuk.homework.lesson9.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        Task_14_15_17_18.Triangle triangle = new Task_14_15_17_18.Triangle( 5 );
        double area = triangle.CalculateArea( );
        double perimeter = triangle.CalculatePerimeter( );
        if (area == 10.825317547305483) {
            System.out.println( "calculateArea() test passed" );
        } else {
            System.out.println( "calculateArea() test failed" );
        }
        if (perimeter == 15) {
            System.out.println( "calculateArea() test passed" );
        } else {
            System.out.println( "calculateArea() test failed" );
        }
    }


}
