package students.kristina_konovalchuk.homework.lesson16.level_3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_7 {
    public class ThreadSafeIdGeneratorComplexState {
        private final AtomicInteger id = new AtomicInteger( 0 );
        private final AtomicBoolean even = new AtomicBoolean( true );

        public int nextId() {
            int newId = id.incrementAndGet( );
            even.set( isEven( newId ) );
            return newId;
        }

        public boolean isEven() {
            return even.get( );
        }

        public boolean isEven(int number) {
            return number % 2 == 0;
        }

    }

    public class Main {
        public void main(String[] args) {
            ThreadSafeIdGeneratorComplexState generator = new ThreadSafeIdGeneratorComplexState( );
            Thread thread1 = new Thread( () -> {
                for (int i = 0; i < 1000000; i++) {
                    int id = generator.nextId( );
                    boolean even = generator.isEven( );
                    if (id % 2 != 0 && even) {
                        System.out.println( "Inconsistent state : id = " + id + ", even = " + even );
                    }
                }
            } );
            Thread thread2 = new Thread( () -> {
                for (int i = 0; i < 1000000; i++) {
                    int id = generator.nextId( );
                    boolean even = generator.isEven( );
                    if (id % 2 == 0 && !even) {
                        System.out.println( "Inconsistent state : id = " + id + ", even = " + even );
                    }
                }
            } );
            thread1.start( );
            thread2.start( );
        }
    }
}
