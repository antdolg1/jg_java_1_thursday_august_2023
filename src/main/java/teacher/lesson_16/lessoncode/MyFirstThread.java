package teacher.lesson_16.lessoncode;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hi guys! I am thread! My name is: " + getName());
    }

}
