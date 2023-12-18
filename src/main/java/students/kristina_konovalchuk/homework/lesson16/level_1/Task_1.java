package students.kristina_konovalchuk.homework.lesson16.level_1;

public class Task_1 {
    class HelloWorldsThread extends Thread {
        public void run() {
            System.out.println( "Hello World!" );
        }
    }

    public class Main {
        public void main(String[] args) {
            HelloWorldsThread helloThread = new HelloWorldsThread( );
            helloThread.start( );
        }
    }
}
