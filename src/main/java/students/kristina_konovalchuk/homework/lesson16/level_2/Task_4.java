package students.kristina_konovalchuk.homework.lesson16.level_2;

public class Task_4 {
    public class NotThreadSafeIdGenerator {
        private int id;

        public int nextId() {
            return id++;
        }

        public class Main {
            public void main(String[] args) {
                NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator( );
                Thread thread1 = new Thread( () -> {
                    for (int i = 0; i < 1000; i++) {
                        int id = idGenerator.nextId( );
                        System.out.println( "Thread 1: Generator ID " + id );
                    }
                } );
                Thread thread2 = new Thread( () -> {
                    for (int i = 0; i < 1000; i++) {
                        int id = idGenerator.nextId( );
                        System.out.println( "Thread 2: Generator ID " + id );
                    }
                } );
                thread1.start( );
                thread2.start( );
            }

        }
    }
}
