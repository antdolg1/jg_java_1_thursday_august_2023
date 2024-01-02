package students.denis_asipenka.lesson_16.level_4;

public class NotThreadSafeIdGeneratorComplexStateDemo {
    public static void main(String[] args) {
        NotThreadSafeIdGeneratorComplexState notThreadSafeIdGeneratorComplexState = new NotThreadSafeIdGeneratorComplexState();
        Thread thread = new Thread(notThreadSafeIdGeneratorComplexState);
        Thread thread1 = new Thread(notThreadSafeIdGeneratorComplexState);
        Thread thread2 = new Thread(notThreadSafeIdGeneratorComplexState);
        Thread thread3 = new Thread(notThreadSafeIdGeneratorComplexState);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}