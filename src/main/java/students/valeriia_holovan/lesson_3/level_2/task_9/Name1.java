package students.valeriia_holovan.lesson_3.level_2.task_9;

import java.util.Scanner;

public class Name1 {
    public static void main(String[] args) {
        String a = "Hi, ";
        String phrase1; // переменная будет хранить текстовую строку,обьявление переменной с именем phrase1

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        phrase1 = sc.nextLine(); // считает строку

        String b = phrase1;
        System.out.println(a + b);
    }
}
