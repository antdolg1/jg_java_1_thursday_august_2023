package students.julija_pilenkova.homework.lesson_6.level_4;

import java.util.Scanner;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int a = 100;

        while (a > 1) {
            a++;
            if (a % 2 == 0)
                continue;
            System.out.println(a);

        }
    }
}