package students.emilija_ostasevska.homework.lesson_16.level_1;

public class HelloWorldThread extends Thread {
    private static int threadCounter = 0;

    public void run() {
        int uniqueNumber = ++threadCounter;
        System.out.println("[" + uniqueNumber + "] Hello World!");
    }

    public static void main(String[] args) {
        int numberOfThreads = 5;

        for (int i = 0; i < numberOfThreads; i++) {
            HelloWorldThread thread = new HelloWorldThread();
            thread.start();
        }
    }
    
}