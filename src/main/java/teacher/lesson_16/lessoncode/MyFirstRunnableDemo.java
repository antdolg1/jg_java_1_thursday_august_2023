package teacher.lesson_16.lessoncode;

public class MyFirstRunnableDemo {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("CoolThreadsBand");
        Thread thread = new Thread(group, new MyFirstThreadRunnable(), "COOL_THREAD");
        System.out.println("Thread info: " + thread);
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread info: " + thread);
        System.out.println("Thread " + thread.getName() + " is daemon thread " + thread.isDaemon());

        thread.start();

    }
}
