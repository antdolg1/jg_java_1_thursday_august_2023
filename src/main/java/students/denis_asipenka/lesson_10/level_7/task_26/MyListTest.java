package students.denis_asipenka.lesson_10.level_7.task_26;

public class MyListTest {
    public static void main(String[] args) {
        MyListTest test = new MyListTest();
        test.addTest();
        test.removeArray();
    }

    void addTest() {
        MyListIm myListIm = new MyListIm();
        for (int i = 0; i < 51; i++) {
            myListIm.addElements(i);
        }
        checkResult(myListIm.array.length == 51, "Тест на добавление элементов: ");
    }

    void removeArray() {
        MyListIm myListIm = new MyListIm();
        for (int i = 0; i < 100; i++) {
            myListIm.arrayRemove[i] = i;
        }
        for (int i = 0; i < 100; i++) {
            myListIm.removeElements();
        }
        checkResult(myListIm.arrayRemove.length == 0, "Тест на удаление элементов: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}