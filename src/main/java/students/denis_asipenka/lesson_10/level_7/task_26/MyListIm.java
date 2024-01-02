package students.denis_asipenka.lesson_10.level_7.task_26;

import java.util.Arrays;

public class MyListIm implements MyList {
    int[] array = new int[0];
    int[] arrayRemove = new int[100];

    @Override
    public void addElements(int number) {
        int[] newArrayProduct = new int[array.length + 1];
        newArrayProduct = Arrays.copyOf(array, newArrayProduct.length);
        newArrayProduct[newArrayProduct.length - 1] = number;
        array = newArrayProduct;
    }

    @Override
    public void removeElements() {
        int[] newArrayProduct = new int[arrayRemove.length - 1];
        newArrayProduct = Arrays.copyOf(arrayRemove, newArrayProduct.length);
        arrayRemove = newArrayProduct;
    }

    void printArray() {
        for (Integer a : array) {
            System.out.print(a + " ");
        }
    }

    void printArray1() {
        for (Integer a : arrayRemove) {
            System.out.print(a + " ");
        }
    }
}