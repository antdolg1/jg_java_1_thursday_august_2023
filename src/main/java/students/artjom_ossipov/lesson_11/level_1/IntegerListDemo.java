package students.artjom_ossipov.lesson_11.level_1;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(0, 52);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.isEmpty());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
