package students.kristina_konovalchuk.homework.lesson16.level_1;

public class Task_2 {
    public class HelloWorldThreads {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                Thread helloThread = new Thread( () -> {
                    System.out.println( "Hello world!" );
                } );
                helloThread.start( );
            }
        }
    }
}
