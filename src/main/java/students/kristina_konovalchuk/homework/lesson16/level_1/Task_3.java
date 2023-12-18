package students.kristina_konovalchuk.homework.lesson16.level_1;

public class Task_3 {
    public class HelloWorldThreads {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) ;
            {
                Thread helloThread = new Thread( () -> {
                    int threadId = ( int ) Thread.currentThread( ).getId( );
                    System.out.println( "[" + threadId + "] Hello, World!" );
                } );
            }
        }
    }
}
