package students.denis_asipenka.lesson_12.level_4;

public class Task_26 {
    public static void main(String[] args) {
        Task_26 task26 = new Task_26();
        task26.methodOverflow();
    }

    void methodOverflow() {
        while (true) {
            methodOverflow();
        }
    }
}