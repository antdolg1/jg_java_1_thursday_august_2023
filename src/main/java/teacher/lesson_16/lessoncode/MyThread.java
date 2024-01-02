package teacher.lesson_16.lessoncode;

public class MyThread extends  Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from myThread object " + i);
        }
    }

}
