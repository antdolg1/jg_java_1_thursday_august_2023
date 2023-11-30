package teacher.lesson_16.lessoncode;

public class MyFirstThreadDemoTwo {
    public static void main(String[] args) {

        MyFirstThread myFirstThread = new MyFirstThread();
        System.out.println(myFirstThread.getState());
        myFirstThread.setName("ARROW");
        myFirstThread.start();
        System.out.println(myFirstThread.getState());
    }
}
