package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {

    private static final int ELEMENTS_COUNT = 100000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //1. Adding element sequentially
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList adding element sequentially: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList adding element sequentially: " + (endTime - startTime) + "ms");

        //2. Add element to the beginning
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList add to the beginning: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList add to the beginning: " + (endTime - startTime) + "ms");

        //3. Access elements
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList get: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (endTime - startTime) + "ms");

    }
}
