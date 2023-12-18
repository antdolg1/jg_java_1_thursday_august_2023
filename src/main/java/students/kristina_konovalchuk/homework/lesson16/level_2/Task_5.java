package students.kristina_konovalchuk.homework.lesson16.level_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Task_5 {
    public class ThreadSafeAtomicIdGenerator {
        public static final AtomicInteger idCounter = new AtomicInteger( 0 );

        public int nextId() {
            return idCounter.incrementAndGet( );
        }

        public void main(String[] args) {
            ThreadSafeAtomicIdGenerator idGenerator = new ThreadSafeAtomicIdGenerator( );
            Thread thread1 = new Thread( () -> {
                for (int i = 0; i < 1000; i++) {
                    int id = idGenerator.nextId( );
                    System.out.println( "Thread 1: Generated ID " + id );
                }
            } );
            Thread thread2 = new Thread( () -> {
                for (int i = 0; i < 1000; i++) {
                    int id = idGenerator.nextId( );
                    System.out.println( "Thread 2 : Generated ID " + id );
                }
            } );
            thread1.start( );
            thread2.start( );
        }

    }

}
