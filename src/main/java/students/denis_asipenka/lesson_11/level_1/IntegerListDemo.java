package students.denis_asipenka.lesson_11.level_1;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(0, 44);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.isEmpty());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}