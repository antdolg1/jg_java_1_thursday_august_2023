package students.denis_asipenka.lesson_16.level_2;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGenerator extends Thread {

    private AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.incrementAndGet();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(nextId());
        }
    }

    public static void main(String[] args) {
        ThreadSafeAtomicIdGenerator threadSafeAtomicIdGenerator = new ThreadSafeAtomicIdGenerator();
        ThreadSafeAtomicIdGenerator threadSafeAtomicIdGenerator1 = new ThreadSafeAtomicIdGenerator();
        Thread thread1 = new Thread(threadSafeAtomicIdGenerator);
        Thread thread2 = new Thread(threadSafeAtomicIdGenerator1);
        thread1.start();
        thread2.start();
    }
}