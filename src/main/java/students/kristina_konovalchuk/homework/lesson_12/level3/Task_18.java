package students.kristina_konovalchuk.homework.lesson_12.level3;

import java.util.Scanner;

public class Task_18 {
    class NullPointExceptionDemo {
        public static void main(String[] args) {
            String str = null;
            System.out.println( str.length( ) );
            Scanner scanner = new Scanner( System.in );
            while (true) {
                System.out.println( "Enter at integer" );
                if (scanner.hasNext( )) {
                    int number = scanner.nextInt( );
                    System.out.println( "You entered a number: " + number );
                    break;
                } else {
                    System.out.println( "Error. You didn't enter a number. Try again" );
                    scanner.next( );
                }
            }
            scanner.close( );
        }
    }
}
