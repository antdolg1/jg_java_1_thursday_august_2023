package students.kristina_konovalchuk.homework.lesson6.level_4;

import java.util.Scanner;

public class Task_20 {
    public class WhileLoopContinue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner( System.in );
            while (true) {
                int number = scanner.nextInt( );
                if (number == 0) {
                    break;
                }
                if (number % 2 == 0) {
                    continue;
                }
                System.out.println( number );
            }
            System.out.println( "Выход из цыкла" );
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println( "это нечетное число!" );

        }
        System.out.println( "Выход из цыкла" );
    }
}
