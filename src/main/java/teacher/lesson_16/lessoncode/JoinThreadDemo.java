package teacher.lesson_16.lessoncode;

public class JoinThreadDemo {

    public static void main(String[] args) {

        JoinThread thread1 = new JoinThread();
        JoinThread thread2 = new JoinThread();
        JoinThread thread3 = new JoinThread();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
    }
}
