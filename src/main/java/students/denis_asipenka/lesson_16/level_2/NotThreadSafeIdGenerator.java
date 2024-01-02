package students.denis_asipenka.lesson_16.level_2;

public class NotThreadSafeIdGenerator extends Thread {
    private int id;

    public int nextId() {
        return id++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(nextId());
        }
    }

    public static void main(String[] args) {
        NotThreadSafeIdGenerator thread1 = new NotThreadSafeIdGenerator();
        NotThreadSafeIdGenerator thread2 = new NotThreadSafeIdGenerator();
        thread1.start();
        thread2.start();
    }
}