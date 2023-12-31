package students.emilija_ostasevska.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("LinkedList: " + linkedList);

        // CopyOnWriteArrayList
        List<String> copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Java");
        copyOnWriteArrayList.add("Python");
        copyOnWriteArrayList.add("C++");
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);

        // List.of()
        List<String> immutableList = List.of("One", "Two", "Three");
        System.out.println("Immutable List: " + immutableList);
    }
}
