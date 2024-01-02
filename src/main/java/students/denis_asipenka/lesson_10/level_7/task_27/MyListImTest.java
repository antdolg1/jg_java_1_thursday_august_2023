package students.denis_asipenka.lesson_10.level_7.task_27;

public class MyListImTest {
    public static void main(String[] args) {
        MyListImTest test = new MyListImTest();
        test.addElement();
    }

    void addElement() {
        MyListIm myListIm = new MyListIm();
        for (int i = 0; i < 50; i++) {
            myListIm.addElements(i);
        }
        myListIm.printList();
    }
}