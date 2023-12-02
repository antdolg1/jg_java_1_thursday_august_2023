package students.denis_asipenka.lesson_16.level_3;

public class NotThreadSafeIdGeneratorComplexStateDemoV2 {
    public static void main(String[] args) {
        NotThreadSafeIdGeneratorComplexStateV2 notThreadSafeIdGeneratorComplexState = new NotThreadSafeIdGeneratorComplexStateV2();
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