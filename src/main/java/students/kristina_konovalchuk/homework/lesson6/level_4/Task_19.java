package students.kristina_konovalchuk.homework.lesson6.level_4;

import java.util.Scanner;

public class Task_19 {
    class WhileInfiniteLoopBreak {
        public static void main(String[] args) {
            Scanner scanner = new Scanner( System.in );
            while (true) {
                System.out.println( "Введите число : " );
                int number = scanner.nextInt( );
                if (number == 0) {
                    break;
                }
            }
            System.out.println( "Выход из цыкла" );
        }
    }

    class ForInfiniteLoopBreak {
        public static void main(String[] args) {
            for (int i = 0; ; i++) {
                if (i == 0) {
                    break;
                }
                if (i % 2 == 0){
                    continue;
                }
                System.out.println( i );

            }
            System.out.println( "Выход из цыкла" );
        }
    }

}
