package teacher.lesson_16.lessoncode;

public class MyThreadSleepDemo {

    public static void main(String[] args) {


        MyFirstThread thread = new MyFirstThread();

        thread.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
