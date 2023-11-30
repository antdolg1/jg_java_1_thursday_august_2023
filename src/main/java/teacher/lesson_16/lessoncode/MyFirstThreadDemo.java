package teacher.lesson_16.lessoncode;

public class MyFirstThreadDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyFirstThread firstThread = new MyFirstThread();
            firstThread.start();
        }

    }
}
