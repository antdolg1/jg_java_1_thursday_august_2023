package students.kristina_konovalchuk.homework.lesson9.level_6;

public class Task_30 {
    public class VarargsExample {
        public static void main(String[] args) {
            printNumbers( 1, 2, 3, 4, 5 );
            printNumbers( 10, 30 );
            printNumbers( 150 );
        }

        public static void printNumbers(int... numbers) {
            System.out.println( "Numbers: " );
            for (int number : numbers) {
                System.out.println( number );
            }
        }
    }
}
