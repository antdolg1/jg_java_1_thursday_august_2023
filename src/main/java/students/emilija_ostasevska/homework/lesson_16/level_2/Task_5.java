package students.emilija_ostasevska.homework.lesson_16.level_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotThreadSafeIdGenerator {

    private int id;

    public int nextId() {
        return id++;
    }
}

class ThreadSafetyDemo {

    public static void main(String[] args) {
        NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                int nextId = idGenerator.nextId();
                System.out.println("Generated id: " + nextId);
            });
        }

        executorService.shutdown();
    }
}

