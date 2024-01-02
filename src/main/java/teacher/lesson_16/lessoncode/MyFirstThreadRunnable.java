package teacher.lesson_16.lessoncode;

public class MyFirstThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from thread created with Runnable interface!");
    }

    public static void main(String[] args) {
        (new Thread(new MyFirstThreadRunnable())).start();
    }

}
