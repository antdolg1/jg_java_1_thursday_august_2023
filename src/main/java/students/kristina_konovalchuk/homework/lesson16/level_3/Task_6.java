package students.kristina_konovalchuk.homework.lesson16.level_3;

public class Task_6 {
    public class NotThreadSafeIdGeneratorComplexState {
        public int id;
        private boolean even;

        public int nextId() {
            id++;
            this.even = isEven( id );
            return id;
        }

        public boolean isEven() {
            return this.even;
        }

        private boolean isEven(int number) {
            return number % 2 == 0;
        }

    }

    public class Main {
        public void main(String[] args) {
            NotThreadSafeIdGeneratorComplexState generator = new NotThreadSafeIdGeneratorComplexState( );
            Thread thread1 = new Thread( () -> {
                for (int i = 0; i < 1000; i++) {
                    int id = generator.nextId( );
                    boolean even = generator.isEven( );
                    if (id % 2 != 0 && even) {
                        System.out.println( "Inconsistent state : id = " + id + ", even = " + even );
                    }
                }
            } );
            Thread thread2 = new Thread( () -> {
                for (int i = 0; i < 1000; i++) {
                    int id = generator.nextId( );
                    boolean even = generator.isEven( );
                    if (id % 2 != 0 && even) {
                        System.out.println( "Inconsistent state : id = " + id + ", even = " + even );
                    }
                }
            } );
            thread1.start( );
            thread2.start( );
        }
    }
}
