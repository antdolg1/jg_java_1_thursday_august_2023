package students.denis_asipenka.lesson_10.level_7.task_27;

import java.util.LinkedList;

public class MyListIm implements MyList {
    LinkedList<Integer> linkedList = new LinkedList();

    @Override
    public void addElements(int number) {
        linkedList.add(number);
    }

    void printList() {
        for (Integer list : linkedList) {
            System.out.println(list);
        }
    }
}